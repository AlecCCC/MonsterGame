public class BowAndArrowBehavior implements WeaponBehavior{

    public String weaponsName = "Bow And Arrow";

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getVitality() + obj.getIntelligence()+ obj.getLevel();
    }

    @Override
    public String toString() {
        return weaponsName;
    }
}
