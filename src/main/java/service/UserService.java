package service;


import entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User findUser(String account, String password);
}
