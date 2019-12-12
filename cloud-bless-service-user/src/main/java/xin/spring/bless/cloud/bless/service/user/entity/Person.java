package xin.spring.bless.cloud.bless.service.user.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_person")
public class Person implements Serializable{

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

    @Column( columnDefinition =" varchar(255) ")
    private String mail;

    @Column( columnDefinition =" varchar(255) ")
   private String password;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
