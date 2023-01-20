public class Rogue extends BaseHero{

    public Rogue(String name, String className, int attack, int defence, int[] damage, int health, int speed, int supply) {
        super(name, className, attack, defence, damage, health, speed);
    }
    public Rogue(String name){
        super(name, "Rogue", 8, 3, new int[] {2, 4}, 10, 6);
    }
}
