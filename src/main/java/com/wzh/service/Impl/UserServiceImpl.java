package com.wzh.service.Impl;

import com.wzh.dao.IUserDao;
import com.wzh.model.User;
import com.wzh.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月09日
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(int userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public int insertUser(User user) {
        return this.userDao.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return this.userDao.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return this.userDao.deleteUser(id);
    }

}
