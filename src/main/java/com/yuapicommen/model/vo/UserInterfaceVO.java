package com.yuapicommen.model.vo;

import com.yuapicommen.model.entity.InterfaceInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回总调用次数视图（脱敏）
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 **/
@Data
public class UserInterfaceVO extends InterfaceInfo implements Serializable {
    /**
     * 接口总共被调用的次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}