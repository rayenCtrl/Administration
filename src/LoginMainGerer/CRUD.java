package LoginMainGerer;

import java.util.*;

public interface CRUD {
    public int create();

    public void read();

    // public int update(Object object);
    public void update();

    public void delete();

    public int find();

    public List<Object> findAll();

}
