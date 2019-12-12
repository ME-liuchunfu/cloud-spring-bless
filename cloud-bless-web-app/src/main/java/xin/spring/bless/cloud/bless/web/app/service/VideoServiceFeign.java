package xin.spring.bless.cloud.bless.web.app.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xin.spring.bless.cloud.bless.web.app.service.hystrix.VideoServiceHystrix;

/**
 * 这里采用的是feign处理负载均衡的。
 *      关于feign的教程，可参考 http://blog.csdn.net/forezp/article/details/69808079
 *
 * @FeignClient 注解的value的意思是：用于获取哪个服务的；其中cloud-bless-service-video是在 \cloud-spring-bless\cloud-bless-service-video\src\main\resources\application.yml 中配置的 spring.application.name 的值，用于标识服务名
 *
 */
@FeignClient(value = "cloud-bless-service-video", fallback = VideoServiceHystrix.class)
public interface VideoServiceFeign {

    /**
     * @RequestMapping 用于指定调用cloud-bless-service-video服务下的 /video/1 的rest服务
     * @return
     */
    @RequestMapping(value = "/video/{id}")
    String getVideo(@PathVariable("id") Integer id);

    /**
     * 获取所有的视频
     * @return
     */
    @RequestMapping(value = "/getAll")
    String getVideoList();

    /**
     * 保存
     * @param data
     * @return
     */
    @RequestMapping("/video/save")
    String save(@RequestParam("data")String data);
}
