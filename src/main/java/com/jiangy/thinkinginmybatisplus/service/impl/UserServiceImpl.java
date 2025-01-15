package com.jiangy.thinkinginmybatisplus.service.impl;

import com.jiangy.thinkinginmybatisplus.entity.User;
import com.jiangy.thinkinginmybatisplus.dto.UserDTO;
import com.jiangy.thinkinginmybatisplus.mapper.UserMapper;
import com.jiangy.thinkinginmybatisplus.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;

import lombok.RequiredArgsConstructor;

/**
 * <p>描述: [User 服务实现层] </p>
 * <p>创建时间: 2025/01/15 </p>
 *
 * @author <a href="mailto:" rel="nofollow">jiangy</a>
 * @version v1.0
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    /**
     * 获取单个信息
     *
     * @param id 主键
     * @return DTO
     */
    @Override
    public UserDTO get(Serializable id) {
        return null;
    }

    /**
     * 新增信息
     *
     * @param dto 信息
     */
    @Override
    public void save(UserDTO dto) {

    }

    /**
     * 更新信息
     *
     * @param dto 信息
     */
    @Override
    public void update(UserDTO dto) {

    }

    /**
     * 删除信息
     *
     * @param id 主键
     */
    @Override
    public void remove(Serializable id) {

    }
}
