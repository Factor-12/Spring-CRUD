package ru.fedorov.springcrud.dao;

import java.util.List;
import ru.fedorov.springcrud.model.User;

public interface UserDao {
    void add(User user);
    List<User> getAll();
    void edit(User user);
    void removeUser(long id);
    User getById(long id);
}
