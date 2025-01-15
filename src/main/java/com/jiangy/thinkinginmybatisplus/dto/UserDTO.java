package com.jiangy.thinkinginmybatisplus.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * (User)数据传输对象
 *
 * @author jiangy
 * @since 2025-01-15 23:42:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 518114056796926817L;

    private Integer id;
    private String username;
    private Integer age;
}
