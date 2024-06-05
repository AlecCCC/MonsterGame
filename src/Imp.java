public class Imp extends Entity {
    public Imp()
    {
        setName("Imp");
        setHealth(60);
        setLevel(10);
        setVitality(2);
        setDexterity(13);
        setStrength(3);
        setResistance(2);
        setEndurance(0);
        setIntelligence(1);
        setWeaponBehavior(new SwordBehavior());
    }
}
