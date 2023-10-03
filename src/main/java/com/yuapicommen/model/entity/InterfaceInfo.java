package com.yuapicommen.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息
 * @TableName interface_info
 */
@TableName(value ="interface_info")
public class InterfaceInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 后面的路径：类似于 /api/name/user
     */
    private String path;

    /**
     * 主机
     */
    private String host;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 请求头
     */
    public String getRequestHeader() {
        return requestHeader;
    }

    /**
     * 请求头
     */
    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * 响应头
     */
    public String getResponseHeader() {
        return responseHeader;
    }

    /**
     * 响应头
     */
    public void setResponseHeader(String responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * 接口状态（0-关闭，1-开启）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 接口状态（0-关闭，1-开启）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 请求类型
     */
    public String getMethod() {
        return method;
    }

    /**
     * 请求类型
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 创建人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 创建人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    /**
     * 是否删除(0-未删, 1-已删)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除(0-未删, 1-已删)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}