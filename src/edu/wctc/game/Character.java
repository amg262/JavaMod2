package edu.wctc.game;

import edu.wctc.game.interfaces.Attackable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character implements Attackable {

    private String name;
    private int health;
    private boolean isAlive;
    private List<Attack> attacks;

    public Character(final String name, final int health) {
        this.name = name;
        this.health = health;
        isAlive = true;
        attacks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    protected int getHealth() {
        return health;
    }

    protected void setHealth(final int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isStillAlive() {
        return isAlive;
    }

    public void setAlive(final boolean alive) {
        isAlive = alive;
    }

    /**
     * @param incomingAttack
     *
     * @return incomingAttack.toString()
     */
    @Override
    public String isAttacked(final Attack incomingAttack) {

        health -= incomingAttack.getDamage();

        if (health <= 0) {
            isAlive = false;
            health = 0;
        }

        return incomingAttack.toString();
    }

    /**
     * @return
     */
    @Override
    public Attack dealsDamage() {
//        Random rng = new Random();
//        int index = rng.nextInt(attacks.size());
//
//        return attacks.get(index);
        return attacks.get(new Random().nextInt(attacks.size()));
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    /**
     * @param newAttack
     */
    @Override
    public void addAttack(final Attack newAttack) {
        attacks.add(newAttack);
    }

    public void setAttacks(final List<Attack> attacks) {
        this.attacks = attacks;
    }

    @Override
    public String toString() {
        return String.format("Character: %s  |  Health: %d", name, health);
    }
}
