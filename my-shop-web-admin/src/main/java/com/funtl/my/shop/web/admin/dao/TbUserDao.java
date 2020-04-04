package com.funtl.my.shop.web.admin.dao;

import com.funtl.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {

    /**
     * 查询用户表全部信息
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 新增
     * @param tbUser
     */
    void insert(TbUser tbUser);

    /**
     * 删除
     * @param id
     */
    void delete(long id);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    TbUser selectById(long id);

    /**
     * 更新
     * @param tbUser
     */
    void update(TbUser tbUser);

    /**
     * 根据用户名进行模糊查询
     * @param username
     * @return
     */
    List<TbUser> selectByUsername(String username);

}
