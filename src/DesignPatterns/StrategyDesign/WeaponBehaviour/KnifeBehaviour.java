package StrategyDesign.WeaponBehaviour;

public class KnifeBehaviour implements WeaponBeaviour {
    @Override
    public void useWeapon() {
        System.out.println("use Knife");
    }
}
