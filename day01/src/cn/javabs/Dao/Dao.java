package cn.javabs.Dao;

import cn.javabs.entity.User;

public interface Dao {
    int addUser(User user) throws RuntimeException;
}
