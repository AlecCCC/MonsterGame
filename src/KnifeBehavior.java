public class KnifeBehavior implements WeaponBehavior{

    public String weaponsName = "Knife";

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getVitality() + obj.getIntelligence()+ obj.getLevel();
    }

    @Override
    public String toString() {
        return weaponsName;
    }
}
