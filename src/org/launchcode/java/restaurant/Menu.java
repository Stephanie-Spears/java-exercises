package org.launchcode.java.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    private LocalDateTime menuDate;
    private ArrayList<MenuItem> menuList = new ArrayList<>();

    Menu(){
        this.menuDate = LocalDateTime.now();
    }
    Menu(MenuItem... items){
        this();
        for (MenuItem item : items){
            this.menuList.add(item);

        }
    }

    public LocalDateTime getMenuDate() {
        return menuDate;
    }
    public void setMenuDate(LocalDateTime aMenuDate) {
        menuDate = aMenuDate;
    }

    public void addItem(MenuItem anItem){
        menuList.add(anItem);
    }
    public void removeItem(MenuItem anItem){
        menuList.remove(anItem);
    }


    @Override
    public String toString(){
        String str = "";
        for (MenuItem item: menuList){
            str += "\nMenu Item: " + item;
        }
        return ( "\n~*~*~\nMenu Date: \n" + menuDate + "\n----" + str + "~*~*~\n");
    }

}
