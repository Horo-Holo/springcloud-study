package com.yuukin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yuukin.springcloud.service.SentinelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Yuukin
 * @data 2023/1/7 13:12
 */
@RestController
@Slf4j
public class FlowLimitController {

    @Resource
    private SentinelService sentinelService;

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + " ---testB");
        return "------testB";
    }

    @GetMapping("/testC")
    public String testC() {
        return "testC " + sentinelService.sentinelChain();
    }

    @GetMapping("/testD")
    public String testD() {
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 异常比例");
        //int age = 10 / 0;
        return "------testD";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealTestHotKey")
    public String getHotKey(@RequestParam(value = "p1", required = false) String p1,
                            @RequestParam(value = "p2", required = false) String p2) {
        return "getHotKey--------";
    }

    public String dealTestHotKey(String p1, String p2, BlockException exception) {
        return "dealTestHotKey------------";
    }

}
