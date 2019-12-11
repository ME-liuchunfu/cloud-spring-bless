package xin.spring.bless.cloud.bless.web.app.service.hystrix;

import org.springframework.stereotype.Component;
import xin.spring.bless.cloud.bless.web.app.service.MusicServiceFeign;
import xin.spring.bless.cloud.bless.web.app.util.Constrant;

/**
 * 需要实现 MusicServiceFeign 接口实现熔断处理
 */
@Component
public class MusicServiceHystrix implements MusicServiceFeign {


    @Override
    public String getMusic(Integer id) {
        return Constrant.ERROR_STRING;
    }

    @Override
    public String getMusicList() {
        return Constrant.ERROR_STRING;
    }
}
