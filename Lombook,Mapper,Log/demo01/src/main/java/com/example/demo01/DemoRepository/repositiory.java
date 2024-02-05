package com.example.demo01.DemoRepository;

import com.example.demo01.Demo.Admin;
import com.example.demo01.Demo.UserDTo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositiory extends JpaRepository<Admin,Long> {
}
