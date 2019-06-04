package cn.javabs.serviceImpl;

import cn.javabs.Dao.Dao;
import cn.javabs.Dao.impl.DaoImpl;
import cn.javabs.entity.User;
import cn.javabs.service.UserService;

public class userServiceImpl implements UserService {

    Dao userDao = new DaoImpl();


    @Override
    public int addUser(User user) {

        return userDao.addUser(user);


    }
}
