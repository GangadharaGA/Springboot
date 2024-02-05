package com.example.demo01.Service;

import com.example.demo01.Demo.UserDTo;

import java.util.List;

public interface operations {

    public UserDTo createuser(UserDTo user);

    public String deleteuser(Long id);

    public  String deleteall();

    public List<UserDTo> getall();

    public UserDTo getbyId(Long id);
}
