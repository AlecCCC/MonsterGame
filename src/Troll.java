public class Troll extends Entity {
    public Troll() {
        setName("Troll");
        setHealth(60);
        setLevel(10);
        setVitality(4);
        setDexterity(3);
        setStrength(8);
        setResistance(2);
        setEndurance(0);
        setIntelligence(1);
        setWeaponBehavior(new SwordBehavior());
    }
}
