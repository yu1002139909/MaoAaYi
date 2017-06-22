package edu.cqvie.cn.maoaayi.bean;

/**
 * Created by yuyu on 2017/6/12.
 */
public class Order {

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    @Override
    public String toString() {
        return "Order{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    /**
     * data : {"strAddressRealName":"罗","strPhone":"13983183996","strDoorNo":"10-13-2","strAddress":"重庆 重庆 渝北 千山万树","strOrderTaskStatus":"1","strStartTime":"13","strEndTime":"17","strOrderNo":"DD201706080000006","strAddressPhone":"13983183996","strOrderTaskId":"a07355e40458467591b983a4b9bb84ff","strLat":"29.628605666075","strSex":"1","strType":"1","strServiceDate":"2017-06-11","strIsChild":"0","strServiceType":"1","serviceTime":4,"strRealName":"","strIsPet":"0","strLng":"106.48131203492"}
     * code : 1
     * msg : 查询成功
     */


    private DataBean data;
    private int code;
    private String msg;

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "strAddressRealName='" + strAddressRealName + '\'' +
                    ", strPhone='" + strPhone + '\'' +
                    ", strDoorNo='" + strDoorNo + '\'' +
                    ", strAddress='" + strAddress + '\'' +
                    ", strOrderTaskStatus='" + strOrderTaskStatus + '\'' +
                    ", strStartTime='" + strStartTime + '\'' +
                    ", strEndTime='" + strEndTime + '\'' +
                    ", strOrderNo='" + strOrderNo + '\'' +
                    ", strAddressPhone='" + strAddressPhone + '\'' +
                    ", strOrderTaskId='" + strOrderTaskId + '\'' +
                    ", strLat='" + strLat + '\'' +
                    ", strSex='" + strSex + '\'' +
                    ", strType='" + strType + '\'' +
                    ", strServiceDate='" + strServiceDate + '\'' +
                    ", strIsChild='" + strIsChild + '\'' +
                    ", strServiceType='" + strServiceType + '\'' +
                    ", serviceTime=" + serviceTime +
                    ", strRealName='" + strRealName + '\'' +
                    ", strIsPet='" + strIsPet + '\'' +
                    ", strLng='" + strLng + '\'' +
                    '}';
        }

        public String getStrAddressRealName() {
            return strAddressRealName;
        }

        public void setStrAddressRealName(String strAddressRealName) {
            this.strAddressRealName = strAddressRealName;
        }

        public String getStrPhone() {
            return strPhone;
        }

        public void setStrPhone(String strPhone) {
            this.strPhone = strPhone;
        }

        public String getStrDoorNo() {
            return strDoorNo;
        }

        public void setStrDoorNo(String strDoorNo) {
            this.strDoorNo = strDoorNo;
        }

        public String getStrAddress() {
            return strAddress;
        }

        public void setStrAddress(String strAddress) {
            this.strAddress = strAddress;
        }

        public String getStrOrderTaskStatus() {
            return strOrderTaskStatus;
        }

        public void setStrOrderTaskStatus(String strOrderTaskStatus) {
            this.strOrderTaskStatus = strOrderTaskStatus;
        }

        public String getStrStartTime() {
            return strStartTime;
        }

        public void setStrStartTime(String strStartTime) {
            this.strStartTime = strStartTime;
        }

        public String getStrEndTime() {
            return strEndTime;
        }

        public void setStrEndTime(String strEndTime) {
            this.strEndTime = strEndTime;
        }

        public String getStrOrderNo() {
            return strOrderNo;
        }

        public void setStrOrderNo(String strOrderNo) {
            this.strOrderNo = strOrderNo;
        }

        public String getStrAddressPhone() {
            return strAddressPhone;
        }

        public void setStrAddressPhone(String strAddressPhone) {
            this.strAddressPhone = strAddressPhone;
        }

        public String getStrOrderTaskId() {
            return strOrderTaskId;
        }

        public void setStrOrderTaskId(String strOrderTaskId) {
            this.strOrderTaskId = strOrderTaskId;
        }

        public String getStrLat() {
            return strLat;
        }

        public void setStrLat(String strLat) {
            this.strLat = strLat;
        }

        public String getStrSex() {
            return strSex;
        }

        public void setStrSex(String strSex) {
            this.strSex = strSex;
        }

        public String getStrType() {
            return strType;
        }

        public void setStrType(String strType) {
            this.strType = strType;
        }

        public String getStrServiceDate() {
            return strServiceDate;
        }

        public void setStrServiceDate(String strServiceDate) {
            this.strServiceDate = strServiceDate;
        }

        public String getStrIsChild() {
            return strIsChild;
        }

        public void setStrIsChild(String strIsChild) {
            this.strIsChild = strIsChild;
        }

        public String getStrServiceType() {
            return strServiceType;
        }

        public void setStrServiceType(String strServiceType) {
            this.strServiceType = strServiceType;
        }

        public int getServiceTime() {
            return serviceTime;
        }

        public void setServiceTime(int serviceTime) {
            this.serviceTime = serviceTime;
        }

        public String getStrRealName() {
            return strRealName;
        }

        public void setStrRealName(String strRealName) {
            this.strRealName = strRealName;
        }

        public String getStrIsPet() {
            return strIsPet;
        }

        public void setStrIsPet(String strIsPet) {
            this.strIsPet = strIsPet;
        }

        public String getStrLng() {
            return strLng;
        }

        public void setStrLng(String strLng) {
            this.strLng = strLng;
        }

        /**
         * strAddressRealName : 罗
         * strPhone : 13983183996
         * strDoorNo : 10-13-2
         * strAddress : 重庆 重庆 渝北 千山万树
         * strOrderTaskStatus : 1
         * strStartTime : 13
         * strEndTime : 17
         * strOrderNo : DD201706080000006
         * strAddressPhone : 13983183996
         * strOrderTaskId : a07355e40458467591b983a4b9bb84ff
         * strLat : 29.628605666075
         * strSex : 1
         * strType : 1
         * strServiceDate : 2017-06-11
         * strIsChild : 0
         * strServiceType : 1
         * serviceTime : 4
         * strRealName :
         * strIsPet : 0
         * strLng : 106.48131203492
         */

        private String strAddressRealName;
        private String strPhone;
        private String strDoorNo;
        private String strAddress;
        private String strOrderTaskStatus;
        private String strStartTime;
        private String strEndTime;
        private String strOrderNo;
        private String strAddressPhone;
        private String strOrderTaskId;
        private String strLat;
        private String strSex;
        private String strType;
        private String strServiceDate;
        private String strIsChild;
        private String strServiceType;
        private int serviceTime;
        private String strRealName;
        private String strIsPet;
        private String strLng;
    }
}
