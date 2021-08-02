package com.wusuiwei.user.daos;

import com.wusuiwei.user.daos.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author SUIWEI WU
 * @date 2021/7/24 16:49
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        User userEntity = userMapper.selectById(1);
        System.out.println(userEntity);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setMobile("1830001111");
        user.setUsername("张三");
        user.setPassword("zs123456");
        user.setSalt("KFJ131@fas");
        user.setStatus(true);
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setCreateUserId(1);
        user.setUpdateUserId(1);
        userMapper.insert(user);
    }


    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setMobile("18580879120");
        user.setUsername("admin");
        user.setPassword("zs123456");
        user.setSalt("KFJ131@fas");
        user.setStatus(true);
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setCreateUserId(1);
        user.setUpdateUserId(1);
        userMapper.updateById(user);
    }
}