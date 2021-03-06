package com.example.datting.Model;

public class PeopleClass {
    private String name;
    private int image;
    private String message;
    private String time;
    private int soluong;
    public PeopleClass(String name, int image, String message) {
        this.name = name;
        this.image = image;
        this.message = message;
    }

    public PeopleClass(String name, int image, String message, String time) {
        this.name = name;
        this.image = image;
        this.message = message;
        this.time = time;
    }

    public PeopleClass(String name, int image, String message, String time, int soluong) {
        this.name = name;
        this.image = image;
        this.message = message;
        this.time = time;
        this.soluong = soluong;
    }

    public PeopleClass(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
