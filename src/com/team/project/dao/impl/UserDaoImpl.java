package com.team.project.dao.impl;

import com.team.project.dao.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    public ResultSet getAllUser(){
        String sql = "select * from User";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.15/myschool","root","123456");
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs ;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
