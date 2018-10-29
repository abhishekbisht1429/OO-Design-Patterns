import java.util.List;
public class DaoPatternDemo {
  public static void main(String[] args) {
    Dao<User> dao = new UserDao();

    List<User> users = dao.getAll();
    System.out.println("List of Users already Present");
    for(User user:users) {
      System.out.println(user.getId()+"  "+user.getName());
    }

    System.out.println("\nAdding New User");
    User newUser = new User();
    newUser.setId(20);
    newUser.setName("T");

    dao.add(newUser);

    System.out.println("List of all Users after adding new User");
    for(User user:users) {
      System.out.println(user.getId()+"  "+user.getName());
    }
  }
}
