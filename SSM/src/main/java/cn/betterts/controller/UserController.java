package cn.betterts.controller;

import cn.betterts.domain.User;
import cn.betterts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

//    依赖注入
    @Autowired
    private UserService userService;



    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("控制器：查询所有");
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        for (User user: list
             ) {
            System.out.println(user);
        }
        return "list";
    }
    @RequestMapping("/saveUser")
    public void saveUser(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("控制器：保存用户");
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return ;
    }
}
