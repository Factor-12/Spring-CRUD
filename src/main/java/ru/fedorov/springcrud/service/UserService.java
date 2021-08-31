package ru.fedorov.springcrud.service;

import java.util.List;
import ru.fedorov.springcrud.model.User;

public interface UserService {
    void add(User user);
    List<User> getAll();
    void edit(User user);
    void removeUser(long id);
    User getById(long id);
}
