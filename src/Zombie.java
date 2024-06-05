public class Zombie extends Entity{
    public Zombie()
    {
        setName("Zombie");
        setHealth(60);
        setLevel(3);
        setVitality(2);
        setDexterity(3);
        setStrength(3);
        setResistance(3);
        setEndurance(2);
        setIntelligence(1);
        setWeaponBehavior(new SwordBehavior());
    }
}