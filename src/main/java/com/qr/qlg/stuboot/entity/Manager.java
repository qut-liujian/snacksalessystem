package com.qr.qlg.stuboot.entity;

import javax.persistence.*;

@Entity
@Table
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String sex;
    @Column
    private String password;
    @Column
    private Integer telephone;




   /* @ManyToOne
    @JoinColumn(name="bj_id",*//*想要外键约束去掉后面*//*foreignKey=@ForeignKey(name="none",value=ConstraintMode.NO_CONSTRAINT))
    private  Banji bj;*/

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

   /* public Banji getBj() {
        return bj;
    }

    public void setBj(Banji bj) {
        this.bj = bj;
    }*/
}
