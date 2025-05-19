package com.formation_mosh.user_register.service.user;

import com.formation_mosh.user_register.entity.User;
import com.formation_mosh.user_register.repository.UserRepositoryInterface;
import com.formation_mosh.user_register.service.notification.NotificationServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepositoryInterface userRepositoryInterface;
    private final NotificationServiceInterface notificationServiceInterface;

    public UserService(UserRepositoryInterface userRepositoryInterface,
                       NotificationServiceInterface notificationServiceInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
        this.notificationServiceInterface = notificationServiceInterface;
    }

    public void registerUser(User user) {
        //Save the user then send an email notification
        if (user != null && user.getEmail() != null) {
            if (userRepositoryInterface.findByEmail(user.getEmail()) != null) {
                System.out.println("Email " + user.getEmail() + " existe déjà");
            } else {
                this.userRepositoryInterface.save(user);
                this.notificationServiceInterface.send("My message", user.getEmail());
            }
        }
    }


}
