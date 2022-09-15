package com.oppsproject.khalid;

public class Patient {
    private String name ;
    private int age ;
    private Eye eye ;
    private Heart heart ;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye eye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.eye = eye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
