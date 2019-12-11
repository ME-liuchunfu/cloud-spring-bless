package xin.spring.bless.cloud.bless.service.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.spring.bless.cloud.bless.service.user.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {


}
