import java.util.ArrayList;
import java.util.List;

public class EntityList {
    List<Entity> characters = new ArrayList<>();

    public void print()
    {
        for (Entity entity : characters)
        {
            System.out.println(entity.toString());

        }
    }

    public Entity returnEntity(int index)
    {
        return characters.get(index);
    }

    public void initMonster()
    {
        characters.add(new Thief());
        characters.add(new Knight());
        characters.add(new Skeleton());
        characters.add(new Zombie());
        characters.add(new Troll());
        characters.add(new Mimic());
        characters.add(new Imp());
    }

}
