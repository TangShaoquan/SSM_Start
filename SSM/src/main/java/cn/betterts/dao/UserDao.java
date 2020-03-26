package cn.betterts.dao;

import cn.betterts.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserDao {
    /** 
    * @Description: 查询所有用户
    * @Param: []
    * @return: java.util.List<cn.betterts.domain.User>
    * @Author: 唐绍权 
    * @Date: 9:48.2020/3/26
    */
    @Select("select * from user")
    public List<User> findAll();
    
    /** 
    * @Description: 保存用户
    * @Param: [user]
    * @return: void
    * @Author: 唐绍权 
    * @Date: 9:50.2020/3/26
    */
    @Insert("insert into user(username,address,sex,birthday) values(#{username},#{address},#{sex},#{birthday})")
    public void saveUser(User user);
}
