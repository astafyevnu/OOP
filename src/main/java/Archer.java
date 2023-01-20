public class Archer extends BaseHero{

    Integer shoots;
    public Archer(String name, String className, int attack, int defence, int[] damage, int health, int speed, int shoots) {
        super(name, className, attack, defence, damage, health, speed);
        this.shoots = shoots;
    }
    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
    public Archer(String name){
        super(name, "Archer", 12, 10, new int[] {8, 10}, 15, 9);
        this.shoots = 32;
    }
}

