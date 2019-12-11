package xin.spring.bless.cloud.bless.web.app.service.hystrix;

import org.springframework.stereotype.Component;
import xin.spring.bless.cloud.bless.web.app.service.VideoServiceFeign;
import xin.spring.bless.cloud.bless.web.app.util.Constrant;

/**
 * 需要实现 VideoServiceFeign 接口实现熔断处理
 */
@Component
public class VideoServiceHystrix implements VideoServiceFeign {

    @Override
    public String getVideo(Integer id) {
        return Constrant.ERROR_STRING;
    }

    @Override
    public String getVideoList() {
        return Constrant.ERROR_STRING;
    }

}
