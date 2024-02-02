package com.example.Studentdata.Services;

import com.example.Studentdata.model.Student;
import com.example.Studentdata.repository.repo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_service {

    private final repo studentrepo;


    public Student_service(repo studentrepo) {
        this.studentrepo = studentrepo;
    }

    public List<Student> getall(){
        return studentrepo.findAll();
    }

    public Student getid(long id){
        return studentrepo.findById(id).orElse(null);
    }

    public Student create(Student data){
        return studentrepo.save(data);
    }

    public Student update(Student data,long id){
        Student s1=studentrepo.findById(id).get();
        s1.setId(data.getId());
        s1.setName(data.getName());
        s1.setBranch(data.getBranch());
        s1.setCollege(data.getCollege());

        return studentrepo.save(s1);
    }

    public String deletebyid(long id){
        studentrepo.deleteById(id);
        System.out.println("Hello Buddy");
        return "😊deleted data of ID no👍:"+id;
    }

    public String deleteall(){
        studentrepo.deleteAll();
        return "Deleted All the Data😒";
    }



//    public String
}
