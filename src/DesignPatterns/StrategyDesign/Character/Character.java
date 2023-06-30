package StrategyDesign.Character;

import StrategyDesign.WeaponBehaviour.WeaponBeaviour;

public abstract class Character {
    private WeaponBeaviour behaviour; // encapsulate what is changing
    public void fight()
    {

    }
    public void setBehaviour(WeaponBeaviour behaviour) {
        this.behaviour = behaviour;
    }
}
