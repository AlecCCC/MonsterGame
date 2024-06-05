import java.util.Scanner;

public class Player extends Entity implements LevelUp{

    Scanner keyBoard = new Scanner(System.in);
    private WeaponList weaponList = new WeaponList();


    public Player( String name, int vitality, int strength, int resistance, int dexterity, int endurance, int intelligence,WeaponBehavior weaponBehavior)
    {
        setHealth(100);
        setLevel(1);
        setName(name);
        setVitality(vitality);
        setStrength(strength);
        setResistance(resistance);
        setDexterity(dexterity);
        setEndurance(endurance);
        setIntelligence(intelligence);
        setWeaponBehavior(weaponBehavior);
    }

    public Player() {

    }

    public void createPlayer()
    {
        setHealth(100);
        setLevel(1);
        weaponList.initWeapon();
        System.out.print("Enter your player name>> ");
        setName(keyBoard.nextLine());
        System.out.print("Player Vitality>> ");
        setVitality(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player Strength>> ");
        setStrength(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player resistance>> ");
        setResistance(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player dexterity>>");
        setDexterity(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player endurance>> ");
        setEndurance(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player intelligence>> ");
        setIntelligence(Integer.parseInt(keyBoard.nextLine()));
        System.out.print("Player weaponBehavior>> ");
        System.out.println();
        weaponList.printWeapons();
        setWeaponBehavior(weaponList.returnWeapon(Integer.parseInt(keyBoard.nextLine())));
    }


    @Override
    public void levelUp()
    {
        if (getLevel() != 5) {
            setLevel(getLevel() + 1);
        }else
        {
            setLevel(5);
        }

    }

    public void isAlive(boolean bool)
    {
        if (bool)
        {
            levelUp();
            setHealth(100);
        }
    }
}
