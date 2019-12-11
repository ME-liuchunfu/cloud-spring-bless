package xin.spring.bless.cloud.bless.service.video.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.spring.bless.cloud.bless.service.video.entity.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {


}
