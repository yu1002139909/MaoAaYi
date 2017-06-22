package edu.cqvie.cn.maoaayi.bean;

/**
 * Created by yuyu on 2017/6/21.
 */
public class Employe {
    private int img;
    private String name;
    private int momeny;

    public Employe() {
    }

    public Employe(int img, String name, int momeny) {
        this.img = img;
        this.name = name;
        this.momeny = momeny;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMomeny() {
        return momeny;
    }

    public void setMomeny(int momeny) {
        this.momeny = momeny;
    }
}
