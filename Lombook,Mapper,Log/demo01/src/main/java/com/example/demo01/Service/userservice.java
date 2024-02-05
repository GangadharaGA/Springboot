package com.example.demo01.Service;

import com.example.demo01.Demo.Admin;
import com.example.demo01.Demo.UserDTo;
import com.example.demo01.Demo.mapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo01.DemoRepository.repositiory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
//@NoArgsConstructor
public class userservice implements operations{

    @Autowired
   private  repositiory repo;
   private static final Logger LOG = LoggerFactory.getLogger(Admin.class);


    @Override
    public UserDTo createuser(UserDTo user) {
        Admin n1= mapper.maptoUser(user);
        return mapper.maptoUserDTo(repo.save(n1));
    }

    public List<UserDTo> getall() {
       List<Admin> n1=repo.findAll();
        return n1.stream().map(mapper::maptoUserDTo).collect(Collectors.toList());
    }

    @Override
    public UserDTo getbyId(Long id) {
        Admin n1=repo.findById(id).orElse(null);

        return mapper.maptoUserDTo(n1);
    }

//    @Override
//    public UserDTo get(Long id) {
//        UserDTo a1=repo.findById(id);
//       return mapper.maptoUser(a1);
//    }

    @Override
    public String deleteuser(Long id) {
        repo.deleteById(id);
        return "Deleted the User😎";
    }

    @Override
    public String deleteall() {
        repo.deleteAll();
        LOG.info("User has been Deleted");
        return null;
    }



}
