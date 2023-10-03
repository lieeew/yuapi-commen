package com.yuapicommen.service;


import com.yuapicommen.model.entity.User;

/**
 * @author leikooo
 * @create 2023-10-01 20:45
 * @Package com.yuapicommen.service
 * @Description
 */
public interface InnerUserService {

    /**
     * 通过 accessKey secretKey 获取用户信息
     *
     * @param accessKey accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
