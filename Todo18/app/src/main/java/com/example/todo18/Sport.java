package com.example.todo18;

public class Sport {
    private String title;
    private String inro;
   private final int imgRes;


    public Sport(String title, String inro, int imgRes) {
        this.title = title;
        this.inro = inro;
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInro() {
        return inro;
    }

    public void setInro(String inro) {
        this.inro = inro;
    }

    public int getImgRes() {
        return imgRes;
    }
}
