package com.wusuiwei.user.controllers;

import com.wusuiwei.gateway.exception.ServiceException;
import com.wusuiwei.user.daos.entities.User;
import com.wusuiwei.user.models.LoginRequestDTO;
import com.wusuiwei.user.models.RegisterRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUIWEI WU
 * @date 2021/8/2 17:07
 */
@RestController
public class AuthController {
    @GetMapping("/hello")
    public List<User> hello() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setMobile("1");
        user.setUsername("fafa");
        user.setPassword("pas");
        user.setSalt("salt");
        user.setStatus(true);
        user.setCreateAt(1212L);
        user.setUpdateAt(12L);
        user.setCreateUserId(1);
        user.setUpdateUserId(2);
        users.add(user);
        return users;
    }

    @RequestMapping(value = "/exception")
    public String exception() {
        throw new ServiceException(11000L, "exception1111");
    }

    /**
     * 用户登录
     *
     * @param loginRequestDTO
     * @return
     */
    @PostMapping("/login")
    public String login(LoginRequestDTO loginRequestDTO) {
        //todo 授权，生成token
        String token = "";
        return token;
    }

    /**
     * 退出登录
     */
    @PostMapping("/logout")
    public void logout() {
        //todo 退出登录
    }

    /**
     * 注册
     *
     * @param registerRequestDTO
     * @return
     */
    @PostMapping("/register")
    public String register(RegisterRequestDTO registerRequestDTO) {
        //todo 注册新用户，授权，生成token
        String token = "";
        return token;
    }

    /**
     * 获取个人信息
     *
     * @return
     */
    @PostMapping("/userInfo")
    public String userInfo() {
        //todo 注册新用户，授权，生成token
        String token = "";
        return token;
    }

    /**
     * 获取菜单权限
     *
     * @return
     */
    @PostMapping("/authList")
    public List<String> authList() {
        return new ArrayList<>();
    }
}
