import java.util.ArrayList;

public class Warrior extends BaseHero {
    public Warrior(String name, int attack, int defence, int[] damage, int maxHealth, int speed) {
        super(name, attack, defence, damage, maxHealth, speed);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }
}