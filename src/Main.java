import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        WeaponList weaponList = new WeaponList();
        EntityList entityList = new EntityList();

        entityList.initMonster();
        weaponList.initWeapon();

        Collections.shuffle(entityList.characters);
        int userMonster;

        Player player1 = new Player();
        player1.createPlayer();
        System.out.println(player1.toString());


        System.out.println("Enter the number of monsters you want to fight ( Available monsters " + entityList.characters.size() + " )");// fix
        userMonster = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < userMonster;i++)
        {
            System.out.println( i + ": " + entityList.characters.get(i).getName());
            System.out.println("=================================================================\n\n");
        }


        for (int i =0; i < userMonster; i++)
        {
            while(entityList.characters.get(i).getHealth() > 0)
            {
                System.out.println("You hit the " + entityList.characters.get(i).getName() + " for " + player1.getAttack());
                entityList.characters.get(i).setHealth(entityList.characters.get(i).getHealth() - player1.getAttack());
                System.out.println(entityList.characters.get(i).getName() + " Health: " + entityList.characters.get(i).getHealth());
                System.out.println("=================================================================");
                if (entityList.characters.get(i).getHealth() >= 0)
                {
                    System.out.println(entityList.characters.get(i).getName() + " attacks back for " + entityList.characters.get(i).getAttack());
                    player1.setHealth(player1.getHealth() - entityList.characters.get(i).getAttack());
                    System.out.println("Your remaining health is " + player1.getHealth());
                    if (player1.getHealth() <=0)
                    {
                        System.out.println("You have been defeated!");
                        System.exit(0);
                    }
                }else if (entityList.characters.get(i).getHealth() < 0) {
                    System.out.println("You defeated " + entityList.characters.get(i).getName() + " do you want to take the monster weapon");
                    System.out.println("=================================================================");
                    if (keyboard.nextLine().equalsIgnoreCase("yes")) {
                        player1.setWeaponBehavior(entityList.characters.get(i).getWeaponBehavior());
                        player1.isAlive(true);
                        System.out.println("New attack power = " + player1.getAttack() + "\nyour health is " + player1.getHealth());

                    }
                }
            }
        }
        if (player1.getHealth() > 0)
        {
            System.out.println("You won!!");
        }
    }
}
