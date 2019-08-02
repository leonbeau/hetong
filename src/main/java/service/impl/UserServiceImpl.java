package service.impl;


import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public User findUser(String account, String password) {
        User user=userDao.findUserByName(account,password);
        if (user!=null)
            return user;
        return null;
    }
}
