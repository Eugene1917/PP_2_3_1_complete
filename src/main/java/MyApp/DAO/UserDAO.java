package MyApp.DAO;

import MyApp.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUser();
    void add(User user);
    void edit(User user);
    User getById(long id);
    void update(long id,User user);
    void remove(long id);
}