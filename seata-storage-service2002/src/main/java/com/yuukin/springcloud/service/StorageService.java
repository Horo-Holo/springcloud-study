package com.yuukin.springcloud.service;

/**
 * @author Yuukin
 * @data 2023/1/8 11:19
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
