package com.example.demo01.Demo;

public class mapper {

    public static UserDTo maptoUserDTo(Admin admin){
        return  new UserDTo(
                admin.getId(),
                admin.getUsername(),
                admin.getUsermail()

        );
    }

    public static Admin maptoAdmin(UserDTo user){
        return new Admin(
                user.getId(),
                user.getUsername(),
                user.getUseremail(),
                ""
        );
    }
}
