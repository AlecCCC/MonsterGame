import java.util.ArrayList;
import java.util.List;

public class WeaponList {
    List<WeaponBehavior> weaponBehaviorList = new ArrayList<>();
    int i = 0;

    public void printWeapons()
    {
        for (WeaponBehavior wp : weaponBehaviorList)
        {

            System.out.print(i + ": ");
            System.out.println(wp.toString());
            i++;

        }
    }

    public WeaponBehavior returnWeapon(int index)
    {
        return weaponBehaviorList.get(index);
    }

    public void initWeapon()
    {
        weaponBehaviorList.add(new AxeBehavior());
        weaponBehaviorList.add(new SwordBehavior());
        weaponBehaviorList.add(new BowAndArrowBehavior());
        weaponBehaviorList.add(new KnifeBehavior());
    }
}
