package edu.wctc.game.interfaces;


import edu.wctc.game.Attack;

import java.util.List;

public interface Attackable {

    /**
     * @param incomingAttack
     *
     * @return
     */
    String isAttacked(Attack incomingAttack);

    /**
     * @return
     */
    Attack dealsDamage();

    /**
     * @return
     */
    List<Attack> getAttacks();

    /**
     * @param newAttack
     */
    void addAttack(Attack newAttack);
}
