package com.example.demo01.Demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTo {


        private Long id;
        private String username;
        private String useremail;
        private String userpassword;

}
