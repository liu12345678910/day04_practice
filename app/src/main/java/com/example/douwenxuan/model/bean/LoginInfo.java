package com.example.douwenxuan.model.bean;

import java.util.List;

public class LoginInfo {

    /**
     * code : 200
     * ret : 登录成功
     * data : [{"id":30,"uid":"29","name":"zq1","password":"123456","age":18,"sex":1,"phone":"13551145346","header":null}]
     */

    private int code;
    private String ret;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 30
         * uid : 29
         * name : zq1
         * password : 123456
         * age : 18
         * sex : 1
         * phone : 13551145346
         * header : null
         */

        private int id;
        private String uid;
        private String name;
        private String password;
        private int age;
        private int sex;
        private String phone;
        private Object header;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getHeader() {
            return header;
        }

        public void setHeader(Object header) {
            this.header = header;
        }
    }
}
