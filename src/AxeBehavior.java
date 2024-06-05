public class AxeBehavior implements WeaponBehavior{

    public String weaponsName = "Axe";

    @Override
    public int useWeapon(Entity obj) {
        return obj.getVitality() + obj.getStrength() + obj.getEndurance()+ obj.getLevel();
    }

    @Override
    public String toString() {
        return weaponsName;
    }
}
