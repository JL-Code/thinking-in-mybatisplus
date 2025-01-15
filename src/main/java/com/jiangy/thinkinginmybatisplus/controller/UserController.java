package com.jiangy.thinkinginmybatisplus.controller;

import com.jiangy.thinkinginmybatisplus.dto.UserDTO;
import com.jiangy.thinkinginmybatisplus.entity.User;
import com.jiangy.thinkinginmybatisplus.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * (User)表控制层
 * <p>创建时间: 2025/01/15 </p>
 *
 * @author <a href="mailto:" rel="nofollow">jiangy</a>
 * @version v1.0
 */
@Validated
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/list")
    public List<User> list() {
        return service.list();
    }

    @PostMapping
    public void saveUser(UserDTO dto) {
        var user = new User();
        BeanUtils.copyProperties(user, dto);
        service.save(user);
    }
}
