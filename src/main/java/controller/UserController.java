package controller;


import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller

public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/login")

    public String login(){
        System.out.println("nihao ");
        return "redirect:/";
    }
    @RequestMapping("/checkLogin")
    public String checkLogin( HttpServletRequest request){
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        System.out.println(account);
        User user=userService.findUser(account,password);
        if (user==null)
            return "redirect:/";
        request.getSession().setAttribute("user",user);
        return "login";
    }
    @RequestMapping("/test/{account}/{password}")
    public  String test(@PathVariable String account,@PathVariable String password){

        User user=userService.findUser(account,password);
        System.out.println(user.getAccount());
        System.out.println(user.getPassword());
        return "index1";
    }
    @RequestMapping(value = "/select/{account}/{password}",method = RequestMethod.GET)
    public void select(@PathVariable String account,@PathVariable String password ){
        User user=userService.findUser(account,password);
        if (user==null){
            System.out.println("null");
        }else {
            System.out.println(user.getAccount()+" "+user.getPassword());
        }
    }
    @RequestMapping(value = "/test")
    public String  hello(){
        return "test";
    }
    @RequestMapping(value = "/test1")
    public String  time(){
        return "time";
    }
}
