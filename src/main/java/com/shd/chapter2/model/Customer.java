package com.shd.chapter2.model;

/**
 * 客户实体
 * Created by shanhaodong on 2018/8/8
 */
public class Customer {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String CONTACT = "contact";
    public static final String TELEPHONE = "telephone";
    public static final String EMAIL = "email";
    public static final String REMARK = "remark";


    /**
     * ID
     */
    private Long id;
    /**
     * 客户名字
     */
    private String name;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
