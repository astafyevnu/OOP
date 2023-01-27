import java.util.ArrayList;

public class Archer extends BaseHero {
    Integer shots;
    public Archer(String name, int attack, int defence, int[] damage, int maxHealth, int speed, int shots) {
        super(name, attack, defence, damage, maxHealth, speed);
        this.shots = shots;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shots " + shots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        for (BaseHero hero : heroList) {
            if (hero.supply == 1) {
                hero.supply -= 1;
                this.shots += 1;
                break;
            }
        }
        if (this.shots > 0) {
            this.shots -= 1;
        } else {
            System.out.println("\nНечем стрелять!");
        }
    }

    @Override
    public String getInfo() {
        return this.getClass().getName().split("\\.")[0] + " HP " + String.valueOf(health * 100/maxHealth) + "%" + " Shots " + shots;
    }
}

