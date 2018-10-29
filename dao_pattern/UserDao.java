import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class UserDao implements Dao<User> {
  // This array list acts as dummy database
  static List<User> userList = new ArrayList<>();
  static {
    User user1 = new User();
    user1.setId(1);
    user1.setName("K");

    User user2 = new User();
    user2.setId(11);
    user2.setName("A");

    userList.add(user1);
    userList.add(user2);
  }

  @Override
  public Optional<User> get(long id) {
    User foundUser = null;
    for(User user:userList) {
      if(user.getId() == id) {
        foundUser = user;
        break;
      }
    }
    return Optional.ofNullable(foundUser);
  }

  public List<User> getAll() {
    return userList;
  }
  public void add(User user) {
    userList.add(user);
  }
  public void delete(User user) {
    userList.remove(user);
  }
}
