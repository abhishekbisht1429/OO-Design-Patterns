import java.util.Optional;
import java.util.List;
public interface Dao<T> {
  Optional<T> get(long id);
  List<T> getAll();
  void add(T t);
  void delete(T t);
}
