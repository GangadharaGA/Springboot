package com.example.demo01.Demo;

public class mapper {

    public static UserDTo maptoUserDTo(Admin admin){
        return  new UserDTo(
                admin.getId(),
                admin.getUsername(),
                admin.getUsermail(),
                admin.getUserpassword()
        );
    }

    public static Admin maptoUser(UserDTo user){
        return new Admin(
                user.getId(),
                user.getUsername(),
                user.getUseremail(),
                user.getUserpassword()
        );
    }
}
