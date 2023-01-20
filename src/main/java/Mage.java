public class Mage extends BaseHero{
    int mana;
    public Mage(String name, String className, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, className, attack, defence, damage, health, speed);
//        this.mana = mana;
    }
    @Override
    public String toString() {
        return super.toString() + ", Mana";
    }
    public Mage(String name){
        super(name, "Mage", 17, 12, new int[] {-5, -5}, 30, 9);
//        this.mana = 1;
    }
}
