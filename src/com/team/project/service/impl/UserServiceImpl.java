package com.team.project.service.impl;

import com.team.project.dao.UserDao;
import com.team.project.dao.impl.UserDaoImpl;
import com.team.project.service.UserService;

import java.sql.ResultSet;

public class UserServiceImpl implements UserService {
    @Override
    public ResultSet getAllUser() {
        UserDao ud = new UserDaoImpl();
        return ud.getAllUser();
    }
}
