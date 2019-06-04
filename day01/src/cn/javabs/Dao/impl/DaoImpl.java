package cn.javabs.Dao.impl;

import cn.javabs.Dao.Dao;
import cn.javabs.entity.User;
import cn.javabs.util.DbcpUtil;
import org.apache.commons.dbutils.QueryRunner;


public class DaoImpl implements Dao {
    QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());

    @Override
    public int addUser(User user) {

        try {
            return qr.update("insert into user(username,password,sex) values (?,?,?)",
                    user.getUsername(),user.getPassword(),user.getSex());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
