package com.qr.qlg.stuboot.entity;

import javax.persistence.*;

@Entity
@Table
public class Snack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String price;
    @Column
    private String type;
    @Column
    private Integer num;
    @Column
    private String picture;



  /*  @ManyToOne
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    /*public Banji getBj() {
        return bj;
    }

    public void setBj(Banji bj) {
        this.bj = bj;
    }*/
}
