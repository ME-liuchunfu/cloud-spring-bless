package xin.spring.bless.cloud.bless.web.app.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.spring.bless.cloud.bless.web.app.service.hystrix.UserServiceHystrix;

/**
 * 这里采用的是feign处理负载均衡的。
 *      关于feign的教程，可参考 http://blog.csdn.net/forezp/article/details/69808079
 *
 * @FeignClient 注解的value的意思是：用于获取哪个服务的；其中cloud-bless-service-user是在 \cloud-spring-bless\cloud-bless-service-user\src\main\resources\application.yml 中配置的 spring.application.name 的值，用于标识服务名
 *
 */
@FeignClient(value = "cloud-bless-service-user",fallback = UserServiceHystrix.class)
public interface UserServiceFeign {

    /**
     * @RequestMapping 用于指定调用cloud-bless-service-user服务下的 /person/1 的rest服务
     * @return
     */
    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    String getUser(@PathVariable("id") Integer id);

    /**
     * 获取所有
     * @return
     */
    @RequestMapping(value = "/getAll")
    String getAllList();

}
