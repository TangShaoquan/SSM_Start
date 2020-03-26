package cn.betterts.service.Impl;

import cn.betterts.dao.UserDao;
import cn.betterts.domain.User;
import cn.betterts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("业务层：查询所有");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("业务层：保存用户");
        userDao.saveUser(user);
    }
}
