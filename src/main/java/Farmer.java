import javax.lang.model.element.Name;

public class Farmer extends BaseHero{

    public Farmer(String name, String className, int attack, int defence, int[] damage, int health, int speed) {
        super(name, className, attack, defence, damage, health, speed);

    }
    public Farmer(String name){
        super(name, "Farmer", 1, 1, new int[] {1, 1}, 1, 3);
    }
    @Override
    public String toString() {
        return super.toString() + ", Supply";
    }
}
