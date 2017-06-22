package edu.cqvie.cn.maoaayi.bean;

import java.io.Serializable;

/**
 * Created by yuyu on 2017/6/12.
 */
public class JsonDate {
    @Override
    public String toString() {
        return "JsonDate{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 1
     * msg : 登录成功
     * data : {"strHeadImg":"20170605/e8c910a9eb614b9a8654ecab13bed6bd.jpg","strRootPath":"http://112.74.45.184:8080/","strRealName":"黄祥英"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        @Override
        public String toString() {
            return "DataBean{" +
                    "strHeadImg='" + strHeadImg + '\'' +
                    ", strRootPath='" + strRootPath + '\'' +
                    ", strRealName='" + strRealName + '\'' +
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

        /**
         * strHeadImg : 20170605/e8c910a9eb614b9a8654ecab13bed6bd.jpg
         * strRootPath : http://112.74.45.184:8080/
         * strRealName : 黄祥英
         */

        private String strHeadImg;
        private String strRootPath;
        private String strRealName;
    }
}
