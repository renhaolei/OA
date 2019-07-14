package com.renhaolei.cowork.sysadmin.domain;

import java.io.Serializable;


public class OrgGroup
        implements Serializable
{
    private static final long serialVersionUID = 3324827029199096094L;
    private String id;
    private Long sortindex;
    private String name;
    private String parentid;
    private String grouptypeid;
    private String owner;
    private String attr1;
    private String attr2;
    private String attr3;

    public boolean isOrg() { return (this.grouptypeid.equals("dept") && this.id.substring(this.id.length() - 3).compareTo("300") >= 0); }



    public String getId() { return this.id; }



    public void setId(String id) { this.id = id; }



    public Long getSortindex() { return this.sortindex; }



    public void setSortindex(Long sortindex) { this.sortindex = sortindex; }



    public String getName() { return this.name; }



    public void setName(String name) { this.name = name; }



    public String getParentid() { return this.parentid; }



    public void setParentid(String parentid) { this.parentid = parentid; }



    public String getGrouptypeid() { return this.grouptypeid; }



    public void setGrouptypeid(String grouptypeid) { this.grouptypeid = grouptypeid; }



    public String getOwner() { return this.owner; }



    public void setOwner(String owner) { this.owner = owner; }



    public String getAttr1() { return this.attr1; }



    public void setAttr1(String attr1) { this.attr1 = attr1; }



    public String getAttr2() { return this.attr2; }



    public void setAttr2(String attr2) { this.attr2 = attr2; }



    public String getAttr3() { return this.attr3; }



    public void setAttr3(String attr3) { this.attr3 = attr3; }
}
