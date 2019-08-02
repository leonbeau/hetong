package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface UserDao {
     User findUserByName(@Param(value = "account") String account, @Param(value = "password")String password);
}
