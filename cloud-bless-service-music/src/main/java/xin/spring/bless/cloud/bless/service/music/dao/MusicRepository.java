package xin.spring.bless.cloud.bless.service.music.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.spring.bless.cloud.bless.service.music.entity.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {


}
