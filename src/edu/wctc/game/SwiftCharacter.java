package edu.wctc.game;

import edu.wctc.game.interfaces.Swift;

import java.util.Random;

public class SwiftCharacter extends Character implements Swift {
    public SwiftCharacter(final String name) {
        super(name, 100);
    }

    /**
     * @param incomingAttack
     *
     * @return incomingAttack.toString()
     */
    @Override
    public String isAttacked(final Attack incomingAttack) {

        if (dodgeAttack()) {
            return String.format("%s %s dodges the attack!", incomingAttack.toString(), getName());
        }

        return super.isAttacked(incomingAttack);
    }

    @Override
    public boolean dodgeAttack() {
//        Random rng = new Random();
//        double chance = rng.nextDouble();
//        return chance >= .7;

        return new Random().nextDouble() >= .7;
    }
}
