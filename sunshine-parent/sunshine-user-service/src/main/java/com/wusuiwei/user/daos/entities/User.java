package com.wusuiwei.user.daos.entities;

import lombok.Data;

/**
 * 用户Entity
 *
 * @author SUIWEI WU
 * @date 2021/7/24 16:40
 */
@Data
public class User {
    private int id;
    private String mobile;
    private String username;
    private String password;
    private String salt;
    private boolean status;
    private long createAt;
    private long updateAt;
    private int createUserId;
    private int updateUserId;
}
