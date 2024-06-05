public class Skeleton extends Entity {
    public Skeleton()
    {
        setName("Skeleton");
        setHealth(100);
        setLevel(4);
        setVitality(1);
        setDexterity(7);
        setStrength(6);
        setResistance(3);
        setEndurance(0);
        setIntelligence(2);
        setWeaponBehavior(new SwordBehavior());
    }

}