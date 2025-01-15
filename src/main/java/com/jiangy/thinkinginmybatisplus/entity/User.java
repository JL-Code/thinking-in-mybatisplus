package com.jiangy.thinkinginmybatisplus.entity;

import java.io.Serial;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * (User)实体类
 *
 * @author jiangy
 * @since 2025-01-15 23:42:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 952761386679684317L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private Integer age;
}
