package com.funtl.my.shop.web.admin.dao.Impl;

import com.funtl.my.shop.domain.User;
import com.funtl.my.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String eamil, String password) {
        logger.debug("调用 getUser(), eamil: {} password: {} ", eamil, password);

        User user = null;
        if ("admin@funtl.com".equals(eamil)){
            if ("admin".equals(password)){
                user = new User();
                user.setEmail("admin@funtl.com");
                user.setUsername("Liran");

                logger.info("成功获取 {} 的用户信息",user.getUsername());
            }
        }else {
            logger.warn("获取 {} 的用户信息失败",eamil);
        }
        return user;
    }
}
