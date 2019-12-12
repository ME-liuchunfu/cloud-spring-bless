package xin.spring.bless.cloud.bless.service.music.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.spring.bless.cloud.bless.service.music.dao.MusicRepository;
import xin.spring.bless.cloud.bless.service.music.entity.Music;

import java.util.List;

/**
 * 音乐服务
 */
@RestController
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    /**
     * 查询单个音乐
     * @param id
     * @return
     */
    @RequestMapping("/music/{id}")
    public Music getOne(@PathVariable("id") Integer id){
        Music person = musicRepository.getOne(id);
        return person;
    }

    /**
     * 查询所有音乐
     * @return
     */
    @RequestMapping("/getAll")
    public List<Music> getListAll(){
        List<Music> all = musicRepository.findAll();
        return all;
    }

    /**
     * 保存
     * @param data
     * @return
     */
    @RequestMapping(value = "/music/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public Music save(String data){
        Music music = new Gson().fromJson(data, Music.class);
        musicRepository.save(music);
        return music;
    }

}
