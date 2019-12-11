package xin.spring.bless.cloud.bless.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xin.spring.bless.cloud.bless.web.app.service.MusicServiceFeign;
import xin.spring.bless.cloud.bless.web.app.service.UserServiceFeign;
import xin.spring.bless.cloud.bless.web.app.service.VideoServiceFeign;

/**
 * 服务调用者
 */
@RestController
@RefreshScope //1、要想@Value所引用的属性动态更新，就必须引入该注解，则客户端调用/bus/refresh接口刷新的时候，才会获取最新git服务器上的属性值，才会动态被更新。
              //2、表示此类scope为refresh类型。允许在运行时动态地刷新bean，如果一个bean被刷新，那么下一次访问bean(即执行一个方法)时，会创建一个新实例。
public class WebController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @Autowired
    private VideoServiceFeign videoServiceFeign;

    @Autowired
    private MusicServiceFeign musicServiceFeign;

    // ============== 用户 =============

    /**
     * 向前端提供一个访问地址；通过userServiceFeign调用服务并返回结果
     * @return
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUserOne(@PathVariable("id") Integer id){
        String result = userServiceFeign.getUser(id);
        return result;
    }

    @RequestMapping(value = "/getUsers")
    public String getUserAll(){
        String result = userServiceFeign.getAllList();
        return result;
    }
    // ============== 用户 =============


    // ============== 音乐 =============

    @RequestMapping(value = "/music/{id}")
    public String getMusicOne(@PathVariable("id") Integer id){
        String result = musicServiceFeign.getMusic(id);
        return result;
    }

    @RequestMapping(value = "/getMusics")
    public String getMusicAll(){
        String result = musicServiceFeign.getMusicList();
        return result;
    }
    // ============== 音乐 =============


    // ============== 视频 =============

    @RequestMapping(value = "/video/{id}")
    public String getVideoOne(@PathVariable("id") Integer id){
        String result = videoServiceFeign.getVideo(id);
        return result;
    }

    @RequestMapping(value = "/getVideos")
    public String getVideoAll(){
        String result = videoServiceFeign.getVideoList();
        return result;
    }
    // ============== 视频 =============


    /**
     * 从配置中心获取的值，其中foo为配置文件中的key。
     *      当前配置中心就采用我的码云上的测试项目 https://gitee.com/zhoubang85/springcloud-config-test.git
     */
    @Value("${message}")
    private String message;

    /**
     * 提供一个测试方法
     * @return
     */
    @RequestMapping(value = "/config/hello")
    public String hello(){
        return message;
    }
}
