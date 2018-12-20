package com.wzh.service;

import com.wzh.model.User;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月09日
 */
public interface IUserService {

    User selectUser(int userId);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
