package com.yuapicommen.service;

/**
 * @author leikooo
 * @create 2023-10-01 20:56
 * @Package com.yuapicommen.service
 * @Description
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用统计接口
     *
     * @param interfaceInfoId 接口信息 id
     * @param userId 用户 id
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
