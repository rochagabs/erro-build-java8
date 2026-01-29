package com.example;

import java.util.List;

public class UserService {

    public void printAdultUsers(List<User> users) {

        // ERRO: inferência inválida com 'var' em campo
        var totalUsers = users.size();

        for (User user : users) {
            if (user.getAge() >= 18) {
                System.out.println(user.getName() + " é adulto");
            }
        }
    }
}
