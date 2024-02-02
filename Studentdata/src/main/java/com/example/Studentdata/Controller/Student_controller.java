package com.example.Studentdata.Controller;

import com.example.Studentdata.Services.Student_service;
import com.example.Studentdata.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student_controller {

    private Student_service service;

    public Student_controller(Student_service service) {
        this.service = service;
    }

    @GetMapping("/Alldata")
    public List<Student> getall(){
        return service.getall();
    }

    @GetMapping("/Dataid/{id}")
    public Student getid(@PathVariable long id){
        return service.getid(id);
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student data){
        return service.create(data);
    }

    @PutMapping("/update/{id}")
    public Student update(@RequestBody Student data,@PathVariable long id){
        return service.update(data,id);
    }

    @DeleteMapping("/deleteall")
    public String deleteall(){
        return service.deleteall();
    }

    @DeleteMapping("/deletebyid/{id}")
    public  String deletebyid(@PathVariable long id){
        return service.deletebyid(id);
    }

}
