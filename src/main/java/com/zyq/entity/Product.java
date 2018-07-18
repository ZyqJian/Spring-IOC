package com.zyq.entity;

/**
 * @author zyq
 * @date 2018/7/17 13:45
 */
public class Product {
    private int id;
    private String inventory;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", inventory='" + inventory + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
