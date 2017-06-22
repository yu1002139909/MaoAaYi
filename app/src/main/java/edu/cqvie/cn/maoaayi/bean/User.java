package edu.cqvie.cn.maoaayi.bean;

/**
 * Created by yuyu on 2017/6/11.
 */
public class User {
        private String strRealName;
        private String strHeadImg;
        private String strRootPath;

    @Override
    public String toString() {
        return "User{" +
                "strRealName='" + strRealName + '\'' +
                ", strHeadImg='" + strHeadImg + '\'' +
                ", strRootPath='" + strRootPath + '\'' +
                '}';
    }

    public String getStrRealName() {
        return strRealName;
    }

    public void setStrRealName(String strRealName) {
        this.strRealName = strRealName;
    }

    public String getStrHeadImg() {
        return strHeadImg;
    }

    public void setStrHeadImg(String strHeadImg) {
        this.strHeadImg = strHeadImg;
    }

    public String getStrRootPath() {
        return strRootPath;
    }

    public void setStrRootPath(String strRootPath) {
        this.strRootPath = strRootPath;
    }
}
