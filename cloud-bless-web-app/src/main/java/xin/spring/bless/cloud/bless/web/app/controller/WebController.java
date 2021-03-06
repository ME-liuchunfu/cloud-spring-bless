package xin.spring.bless.cloud.bless.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/user/login/{mail}/{password}")
    public String login(@PathVariable("mail") String mail, @PathVariable("password") String password){
        String result = userServiceFeign.login(mail, password);
        return result;
    }

    @RequestMapping(value = "/user/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(String data){
        String result = userServiceFeign.save(data);
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

    @RequestMapping(value = "/music/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveMusic(String data){
        String result = musicServiceFeign.save(data);
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

    @RequestMapping(value = "/video/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveVideo(String data){
        String result = videoServiceFeign.save(data);
        return result;
    }
    // ============== 视频 =============

}
