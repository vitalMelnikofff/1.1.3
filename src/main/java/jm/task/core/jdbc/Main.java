package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userServices = new UserServiceImpl();
        userServices.dropUsersTable();
        userServices.createUsersTable();
        userServices.saveUser("Кот", "Котович", (byte) 26);
        userServices.saveUser("Собака", "Собаковна", (byte) 21);
        userServices.saveUser("Говно", "Говнович", (byte) 21);
        userServices.saveUser("Спид", "Спидович", (byte) 26);
        userServices.removeUserById(4);
        List<User> allUsers = userServices.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user.toString());
        }
        userServices.cleanUsersTable();
    }
}