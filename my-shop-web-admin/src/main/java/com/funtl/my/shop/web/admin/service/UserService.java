package com.funtl.my.shop.web.admin.service;

import com.funtl.my.shop.domain.User;

public interface UserService {
    /**
     * 登录
     * @param eamil
     * @param password
     * @return
     */
    public User login(String eamil, String password);
}
