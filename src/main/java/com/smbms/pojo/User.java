package com.smbms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * description:
 * Created by Ray on 2019-09-05
 */
public class User  implements Serializable {
   /*
FieldTypeComment
id bigint(20) NOT NULL主键ID
userCode varchar(15) NULL用户编码
userName varchar(15) NULL用户名称
userPassword varchar(15) NULL用户密码
genderint(10) NULL性别（1:女、 2:男）
birthdaydate NULL出生日期
phonevarchar(15) NULL手机
addressvarchar(30) NULL地址
userRolebigint(20) NULL用户角色（取自角色表-角色id）
createdBybigint(20) NULL创建者（userId）
creationDatedatetime NULL创建时间
modifyBybigint(20) NULL更新者（userId）
modifyDatedatetime NULL更新时间
    */
   private Long id;
   private String userCode;
   private String userName;
   private String userPassword;
   private Integer gender;
   private Date birthday;
   private String phone;
   private String address;
   private Long userRole;
   private Long createdBy;
   private Date creationDate;
   private Long modifyBy;
   private Date modifyDate;
//   private String roleName;
//   private Role role;
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", userRole=" + userRole +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
//                ", role=" + role +
                '}';
    }
}
