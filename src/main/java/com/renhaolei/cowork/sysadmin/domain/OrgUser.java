package com.renhaolei.cowork.sysadmin.domain;

import java.io.Serializable;

public class OrgUser implements Serializable
{
    private static final long serialVersionUID = 8589803468062169050L;

    private String id;

    private String name;

    private String email;

    private String tel;

    private String mobile;

    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;
    private String attr5;
    private String password;

    public String getId() { return this.id; }



    public void setId(String id) { this.id = id; }



    public String getName() { return this.name; }



    public void setName(String name) { this.name = name; }



    public String getEmail() { return this.email; }



    public void setEmail(String email) { this.email = email; }



    public String getTel() { return this.tel; }



    public void setTel(String tel) { this.tel = tel; }



    public String getMobile() { return this.mobile; }



    public void setMobile(String mobile) { this.mobile = mobile; }



    public String getAttr1() { return this.attr1; }



    public void setAttr1(String attr1) { this.attr1 = attr1; }



    public String getAttr2() { return this.attr2; }



    public void setAttr2(String attr2) { this.attr2 = attr2; }



    public String getAttr3() { return this.attr3; }



    public void setAttr3(String attr3) { this.attr3 = attr3; }



    public String getAttr4() { return this.attr4; }



    public void setAttr4(String attr4) { this.attr4 = attr4; }



    public String getAttr5() { return this.attr5; }



    public void setAttr5(String attr5) { this.attr5 = attr5; }



    public String getPassword() { return this.password; }



    public void setPassword(String password) { this.password = password; }
}