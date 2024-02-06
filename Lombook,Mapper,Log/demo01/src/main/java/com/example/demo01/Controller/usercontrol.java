package com.example.demo01.Controller;

import com.example.demo01.Demo.Admin;
import com.example.demo01.Demo.UserDTo;
import com.example.demo01.Demo.mapper;
import com.example.demo01.Service.userservice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@AllArgsConstructor
public class usercontrol {

    private userservice service;
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Admin.class);
    @PostMapping("/add")
    public ResponseEntity<UserDTo> createuser(@RequestBody UserDTo user){
        UserDTo n1= service.createuser(user);
        return new ResponseEntity<>(n1, HttpStatus.CREATED);
    }

    @PostMapping("/getall")
    public ResponseEntity<List<UserDTo>> getuser(){
        LOG.info("\"Hi I am Controller \"");
        List<UserDTo> l1= service.getall();
        return ResponseEntity.ok(l1);
    }



//    @PostMapping("/getid/{id}")
//    public ResponseEntity<UserDTo> getid(@PathVariable Long id){
//        UserDTo u=service.getbyId(id);
//        return ResponseEntity.ok(u);
//    }

    @PostMapping("/getid/{id}")
    public ResponseEntity<UserDTo> getid(@PathVariable Long id){
       UserDTo u=service.getbyId(id);
        return ResponseEntity.ok(u);
    }




    @DeleteMapping("/deleteall")
    public String deleteusers(){
        return  service.deleteall();

    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteuser(@PathVariable Long id){
        return service.deleteuser(id);
    }


}
