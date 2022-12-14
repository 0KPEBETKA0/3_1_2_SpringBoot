package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    public User getUser(int id);
    public void save(User user);
    public void delete(int id);
    public void update(User user);
}
