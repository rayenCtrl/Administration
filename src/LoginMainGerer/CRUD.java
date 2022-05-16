package LoginMainGerer;

import java.util.*;

public interface CRUD {
    public int create();

    public void read();

    public void update(Object object);

    public void delete();

    public int find();

    public List<Object> findAll();

}
