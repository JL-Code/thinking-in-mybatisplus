package com.jiangy.thinkinginmybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiangy.thinkinginmybatisplus.dto.UserDTO;
import com.jiangy.thinkinginmybatisplus.entity.User;

import java.io.Serializable;

/**
 * <p>描述: [User 服务层] </p>
 * <p>创建时间: 2025/01/15 </p>
 *
 * @author <a href="mailto:" rel="nofollow">jiangy</a>
 * @version v1.0
 */
public interface UserService extends IService<User> {

    /**
     * 获取单个信息
     *
     * @param id 主键
     * @return DTO
     */
    UserDTO get(Serializable id);

    /**
     * 新增信息
     *
     * @param dto 信息
     */
    void save(UserDTO dto);

    /**
     * 更新信息
     *
     * @param dto 信息
     */
    void update(UserDTO dto);

    /**
     * 删除信息
     *
     * @param id 主键
     */
    void remove(Serializable id);

}
