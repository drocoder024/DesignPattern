package StrategyDesign;

import StrategyDesign.Character.Character;
import StrategyDesign.Character.King;
import StrategyDesign.Character.Queen;
import StrategyDesign.WeaponBehaviour.AxeBehaviour;
import StrategyDesign.WeaponBehaviour.KnifeBehaviour;
import StrategyDesign.WeaponBehaviour.WeaponBeaviour;

public class DriverMain {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();


        WeaponBeaviour kingWeapon = new KnifeBehaviour();
        WeaponBeaviour queenWeapon = new AxeBehaviour();


        king.setBehaviour(kingWeapon);
        queen.setBehaviour(queenWeapon);
    }
}
