package winter.hibernate;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lequan on 11/9/2016.
 */
public interface DAO <T>
{
    void add(T t);
    T get(Serializable id);
    ArrayList<T> getAll();
    void update(T t);
    void delete(T t);
}
