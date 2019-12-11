package xin.spring.bless.cloud.bless.service.music.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_music")
public class Music implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( columnDefinition=" int(11) ")
	private Integer id;

    @Column( columnDefinition=" varchar(255) ")
    private String name;

    @Column( columnDefinition=" varchar(255) ")
    private String msg;

    @Column( columnDefinition=" varchar(255) ")
    private String url;

    @Column( columnDefinition=" varchar(255) ")
    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", url='" + url + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
