public class Thief extends Entity{
    public Thief()
    {
        setName("Thief");
        setHealth(100);
        setLevel(1);
        setVitality(3);
        setDexterity(8);
        setLevel(1);
        setStrength(2);
        setResistance(1);
        setEndurance(0);
        setIntelligence(4);
        setWeaponBehavior(new KnifeBehavior());
    }

}
