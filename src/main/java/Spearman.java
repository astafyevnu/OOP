public class Spearman extends BaseHero{
    public Spearman(String name, String className, int attack, int defence, int[] damage, int health, int speed) {
        super(name, className, attack, defence, damage, health, speed);
    }
    public Spearman(String name){
        super(name, "Spearman", 4, 5, new int[] {1, 3}, 10, 4);
    }

}
