package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {

    void createTable();

    void dropTable();

    void save(String name, int age, String email);
    void save(User user);

    void update(int id, String updateName, int updateAge, String updateEmail);

    User getOne(int id);

    List<User> getUsers();

    void delete(int id);

    void cleanTable();
}
