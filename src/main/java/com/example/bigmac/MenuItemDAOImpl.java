package com.example.bigmac;
import java.util.ArrayList;
import java.util.List;

public class MenuItemDAOImpl implements MenuItemDAO {

    private List<MenuItem> menuItems;

    public MenuItemDAOImpl() {
        menuItems = new ArrayList<>();
    }

    @Override
    public void save(MenuItem menuItem) {
        menuItems.add(menuItem);
        System.out.println("MenuItem saved: " + menuItem.getName());
    }

    @Override
    public MenuItem findById(int id) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getId() == id) {
                return menuItem;
            }
        }
        return null;
    }

    @Override
    public List<MenuItem> findAll() {
        return menuItems;
    }

    @Override
    public void update(MenuItem menuItem) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getId() == menuItem.getId()) {
                menuItems.set(i, menuItem);
                System.out.println("MenuItem updated: " + menuItem.getName());
                return;
            }
        }
        System.out.println("MenuItem not found: " + menuItem.getName());
    }

    @Override
    public void delete(MenuItem menuItem) {
        if (menuItems.remove(menuItem)) {
            System.out.println("MenuItem deleted: " + menuItem.getName());
        } else {
            System.out.println("MenuItem not found: " + menuItem.getName());
        }
    }
}
