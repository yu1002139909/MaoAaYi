package edu.cqvie.cn.maoaayi.bean;

/**
 * Created by yuyu on 2017/6/12.
 */
public class PaiMin {
    @Override
    public String toString() {
        return "PaiMin{" +
                "msg='" + msg + '\'' +
                ", data=" + data +
                ", code=" + code +
                '}';
    }

    /**
     * msg : 查询成功
     * data : {"strTotalOrder":12,"strTopOrderComment":"100","strTop":1}
     * code : 1
     */
    private String msg;
    private DataBean data;
    private int code;

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class DataBean {
        public int getStrTotalOrder() {
            return strTotalOrder;
        }

        public void setStrTotalOrder(int strTotalOrder) {
            this.strTotalOrder = strTotalOrder;
        }

        public int getStrTop() {
            return strTop;
        }

        public void setStrTop(int strTop) {
            this.strTop = strTop;
        }

        public String getStrTopOrderComment() {
            return strTopOrderComment;
        }

        public void setStrTopOrderComment(String strTopOrderComment) {
            this.strTopOrderComment = strTopOrderComment;
        }

        /**
         * strTotalOrder : 12
         * strTopOrderComment : 100
         * strTop : 1
         */

        private int strTotalOrder;
        private String strTopOrderComment;
        private int strTop;
    }
}
