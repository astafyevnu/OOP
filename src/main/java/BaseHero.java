import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements BaseInterface{
    String className;
    String name;
    int attack, defence, health, speed;
    int [] damage;
    public BaseHero(String name, String className, int attack, int defence, int[] damage, int health, int speed){
        this.className = className;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }


    @Override
    public void step(ArrayList<BaseHero> listHeroes) {

    }

    @Override
    public String getInfo() {
        return this.getClass().getName().split("\\.")[1] + " H" + String.valueOf(health) + "%";
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Class: " + className + ", Attack: " + attack + ", Defence: " + defence + ", Damage: " + Arrays.toString(damage) + ", Health: " + health + ", Speed: " + speed;
    }
}
