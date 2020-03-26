package cn.betterts.service;

import cn.betterts.dao.UserDao;
import cn.betterts.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    /**
     * @Description: 查询所有用户
     * @Param: []
     * @return: java.util.List<cn.betterts.domain.User>
     * @Author: 唐绍权
     * @Date: 9:48.2020/3/26
     */
    public List<User> findAll();

    /**
     * @Description: 保存用户
     * @Param: [user]
     * @return: void
     * @Author: 唐绍权
     * @Date: 9:48.2020/3/26
     */
    public void saveUser(User user);
}
