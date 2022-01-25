package edu.wctc;

public abstract class Item {
    private String name;
    private String desc;

    public Item(final String name, final String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(final String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nDesc: %s", name, desc);
    }
}
