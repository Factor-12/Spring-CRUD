package ru.fedorov.springcrud.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.fedorov.springcrud.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUser(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }
}
