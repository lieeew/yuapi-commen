package com.yuapicommen.service;

import com.yuapicommen.model.entity.InterfaceInfo;

import java.util.Map;

/**
 * @author leikooo
 * @create 2023-10-01 20:52
 * @Package com.yuapicommen.service
 * @Description commen 包里面的类
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询接口是否存在
     *
     * @param path 路径
     * @param method 请求方法
     * @param host ip + 端口
     * @return interfaceInfo 对象
     */
    InterfaceInfo getInterfaceInfo(String path, String host , String method);

    /**
     * 查询 host
     */
    Map<String, String> getHosts();
}
