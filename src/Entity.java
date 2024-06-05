abstract public class Entity {
    private WeaponBehavior weaponBehavior;
    private String name;
    private int health;
    private int level;
    private int vitality;
    private int strength;
    private int resistance;
    private int dexterity;
    private int endurance;
    private int intelligence;
    private int attack;




    //Getter//
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getVitality() {
        return vitality;
    }

    public int getStrength() {
        return strength;
    }

    public int getResistance() {
        return resistance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAttack() { return attack; }

    public WeaponBehavior getWeaponBehavior() { return weaponBehavior;}
    //Getter//

    //Setter//
    public void setWeaponBehavior(WeaponBehavior weaponBehavior)
    {
        this.weaponBehavior = weaponBehavior;
        setAttack();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setAttack() {
        this.attack = weaponBehavior.useWeapon(this);
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Setter//


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", resistance=" + resistance +
                ", dexterity=" + dexterity +
                ", endurance=" + endurance +
                ", intelligence=" + intelligence +
                ", attack=" + attack;
    }


}
