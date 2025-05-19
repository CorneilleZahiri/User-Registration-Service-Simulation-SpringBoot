package com.formation_mosh.user_register;

import com.formation_mosh.user_register.entity.User;
import com.formation_mosh.user_register.service.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UserRegisterApplication.class, args);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.registerUser(new User(1L, "Corneille", "cgbeaga@gmail.com", "test"));
        userService.registerUser(new User(1L, "Corneille", "cgbeaga@gmail.com", "test"));
    }

}
