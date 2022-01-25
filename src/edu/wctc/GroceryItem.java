package edu.wctc;

public class GroceryItem {

    private String name;
    private int quantity;

    public GroceryItem() {
        this.name = "";
        this.quantity = 0;
    }

    public GroceryItem(final String name, final int quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nQty: %d", name, quantity);
    }
}
