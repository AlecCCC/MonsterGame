public class SwordBehavior implements WeaponBehavior{

    public String weaponsName = "Sword";

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getResistance() + obj.getStrength() + obj.getLevel();
    }

    @Override
    public String toString() {
        return weaponsName;
    }
}
