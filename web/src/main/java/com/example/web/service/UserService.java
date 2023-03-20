package com.example.web.service;
import com.example.web.models.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void addUser(User user);

    public void deleteUser(Long id);

    public void updateUser(User user);

    public User getIdUser(Long id);
}
