package com.example.bigmac;
import java.util.ArrayList;
import java.util.List;

public interface MenuItemDAO {

    void save(MenuItem menuItem);

    MenuItem findById(int id);

    List<MenuItem> findAll();

    void update(MenuItem menuItem);

    void delete(MenuItem menuItem);
}
