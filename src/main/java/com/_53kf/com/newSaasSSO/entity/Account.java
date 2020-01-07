package com._53kf.com.newSaasSSO.entity;

import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private Integer is_admin;
    private Integer identity_id;
    private Date register_time;
}
