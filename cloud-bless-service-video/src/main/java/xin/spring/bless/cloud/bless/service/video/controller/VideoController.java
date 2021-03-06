package xin.spring.bless.cloud.bless.service.video.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.spring.bless.cloud.bless.service.video.dao.VideoRepository;
import xin.spring.bless.cloud.bless.service.video.entity.Video;

import java.util.List;

/**
 * 视频服务
 */
@RestController
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    /**
     * 获取单个视频
     * @param id
     * @return
     */
    @RequestMapping("/video/{id}")
    public Video getOne(@PathVariable("id") Integer id){
        Video video = videoRepository.getOne(id);
        return video;
    }

    /**
     * 获取所有的视频
     * @return
     */
    @RequestMapping("/getAll")
    public List<Video> getListAll(){
        List<Video> all = videoRepository.findAll();
        return all;
    }

    /**
     * 保存
     * @param data
     * @return
     */
    @RequestMapping(value = "/video/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public Video save(String data){
        Video video = new Gson().fromJson(data, Video.class);
        videoRepository.save(video);
        return video;
    }

}
