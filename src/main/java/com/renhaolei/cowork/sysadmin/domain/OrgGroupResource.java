package com.renhaolei.cowork.sysadmin.domain;

import java.io.Serializable;



public class OrgGroupResource
        implements Serializable
{
    private static final long serialVersionUID = -6800051282707672390L;
    private String id;
    private String groupId;
    private String resourceId;

    public String getId() { return this.id; }



    public void setId(String id) { this.id = id; }



    public String getGroupId() { return this.groupId; }



    public void setGroupId(String groupId) { this.groupId = groupId; }



    public String getResourceId() { return this.resourceId; }



    public void setResourceId(String resourceId) { this.resourceId = resourceId; }
}