package com.example.springboot.service;

import com.example.springboot.model.Role;
import com.example.springboot.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    void createUser(String name, String surname, int age, String email, String username, String password, Set<Role> roles);
    void editUser(long id, String name, String surname, int age, String email, String username, String password, Set<Role> roles);
    void deleteUser(long id);
}
