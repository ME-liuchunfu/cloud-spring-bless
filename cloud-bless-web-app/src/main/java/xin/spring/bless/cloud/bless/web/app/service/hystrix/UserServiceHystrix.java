package xin.spring.bless.cloud.bless.web.app.service.hystrix;

import org.springframework.stereotype.Component;
import xin.spring.bless.cloud.bless.web.app.service.UserServiceFeign;
import xin.spring.bless.cloud.bless.web.app.util.Constrant;

/**
 * 需要实现 UserServiceFeign 接口
 *
 * 【注意点】feign是自带断路器hystrix的，只是没有默认打开hystrix。需要在配置文件中配置打开，将feign.hystrix.enabled设置为true，则hystrix断路器方可生效，如果不配置或者为false，则页面会报错
 *
 * @Component 将UserServiceHystrix类注入到Ioc容器中
 */
@Component
public class UserServiceHystrix implements UserServiceFeign{

    /**
     * 当 UserServiceFeign 服务不可用的时候，会回调这个方法
     * @return
     */
    @Override
    public String getUser(Integer id) {
        return Constrant.ERROR_STRING;
    }

    @Override
    public String getAllList() {
        return Constrant.ERROR_STRING;
    }

    @Override
    public String login(String mail, String password) {
        return Constrant.ERROR_STRING;
    }

    @Override
    public String save(String data) {
        return Constrant.ERROR_STRING;
    }

//    @Override
//    public String save(String mail, String msg, String name, String password) {
//        return Constrant.ERROR_STRING;
//    }

}
