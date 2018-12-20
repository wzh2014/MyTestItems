package com.wzh.dao;

import com.wzh.model.User;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月09日
 */

public interface IUserDao {

    User selectUser(int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}