package com.jiangy.thinkinginmybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>创建时间: 2025/1/15 </p>
 *
 * @author <a href="mailto:jiangliu0316@outlook.com" rel="nofollow">蒋勇</a>
 */
@RequestMapping("/api/hello")
@RestController
public class HelloController {
    @GetMapping
    public String hello(String name) {
        return "hello, " + name;
    }
}
