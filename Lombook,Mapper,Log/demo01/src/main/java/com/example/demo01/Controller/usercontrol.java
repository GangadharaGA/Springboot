package com.example.demo01.Controller;

import com.example.demo01.Demo.UserDTo;
import com.example.demo01.Demo.mapper;
import com.example.demo01.Service.userservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class usercontrol {

    private userservice service;

    @PostMapping("/add")
    public ResponseEntity<UserDTo> createuser(@RequestBody UserDTo user){
        UserDTo n1= service.createuser(user);
        return new ResponseEntity<>(n1, HttpStatus.CREATED);
    }

    @PostMapping("/getall")
    public ResponseEntity<List<UserDTo>> getuser(){
        List<UserDTo> l1= service.getall();
        return ResponseEntity.ok(l1);
    }

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
