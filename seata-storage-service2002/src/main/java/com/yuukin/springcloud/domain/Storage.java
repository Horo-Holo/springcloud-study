package com.yuukin.springcloud.domain;

import lombok.Data;

/**
 * @author Yuukin
 * @data 2023/1/8 11:17
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
