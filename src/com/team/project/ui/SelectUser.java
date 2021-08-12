package com.team.project.ui;

import com.team.project.service.UserService;
import com.team.project.service.impl.UserServiceImpl;

import java.sql.ResultSet;

public class SelectUser {
    public static void main(String[] args) throws Exception{
        UserService us = new UserServiceImpl();
        ResultSet rs = us.getAllUser();
        System.out.println("编号\t账户名\t密码");
        while (rs.next()){
            System.out.println(rs.getObject(1)+"\t"+rs.getObject(2)+"\t"+rs.getObject(3));
        }
    }
}
