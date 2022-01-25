package edu.wctc;

public class Clothing extends Item {
    private int size;
    private String color;

    public Clothing(final String name, final String desc, final int size, final String color) {
        super(name, desc);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s\nSize: %d\nColor: %s", super.toString(), size, color);
    }
}
