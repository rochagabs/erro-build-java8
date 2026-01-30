package com.example;

import java.util.List;

public class UserService {

    public void printAdultUsers(List<User> users) {
        users.stream()
             .filter(user -> user.age() >= 18)
             .forEach(user -> System.out.println(user.name() + " é adulto"));
    }
}
