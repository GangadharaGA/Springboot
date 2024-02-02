package com.example.Studentdata.repository;

import com.example.Studentdata.model.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<Student, Long> {
}
