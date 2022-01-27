package edu.wctc.game;

public class Attack {

    private String name;
    private int damage;

    public Attack(final String name, final int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(final int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format(" does the %s attack for %d points of damage", name, damage);
    }


}
