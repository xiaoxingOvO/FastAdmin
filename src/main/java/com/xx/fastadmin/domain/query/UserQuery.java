package com.xx.fastadmin.domain.query;

/**
 * @author xx
 * @date 2023/3/24
 */
public class UserQuery {

    private String userId;
    private String userName;
    private String status;
    private String phonenumber;
    private String beginTime;
    private String endTime;

    public UserQuery(String userId, String userName, String status, String phonenumber, String beginTime, String endTime) {
        this.userId = userId;
        this.userName = userName;
        this.status = status;
        this.phonenumber = phonenumber;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
