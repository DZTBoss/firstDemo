package com.dzt.beforedemo.entity;

public class Student {

    private   Integer id;
    private   String  name;
    private   String sex;
    private   String hobby;
    private   Integer s_id;
    private   Integer sid;
    private   String  sname;
    private   String  city;

    public Student(Integer id, String name, String sex, String hobby, Integer s_id, Integer sid, String sname, String city) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
        this.s_id = s_id;
        this.sid = sid;
        this.sname = sname;
        this.city = city;
    }

    public Student() {
    }

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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                ", s_id=" + s_id +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
