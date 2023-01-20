import java.util.ArrayList;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
//        for (int i = 0; i < MaleNames.values().length; i++) {
//            System.out.println(randomName());
//        }
//    }
//
//    private static MaleNames randomName() {
//        int i = new Random().nextInt(MaleNames.values().length);
//        return MaleNames.values()[i];
//    }
//}

        ArrayList<BaseHero> farmer = new ArrayList<>();
        String[] farmerNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            farmer.add(new Farmer(name));
        }
        for(BaseHero character : farmer){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> rogue = new ArrayList<>();
        String[] rogueNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : rogueNames){
            rogue.add(new Rogue(name));
        }
        for(BaseHero character : rogue){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> spearman = new ArrayList<>();
        String[] spearmanNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            spearman.add(new Spearman(name));
        }
        for(BaseHero character : spearman){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        String[] crossbowmanNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            crossbowman.add(new Crossbowman(name));
        }
        for(BaseHero character : crossbowman){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            sniper.add(new Sniper(name));
        }
        for(BaseHero character : sniper){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> mage = new ArrayList<>();
        String[] mageNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            mage.add(new Mage(name));
        }
        for(BaseHero character : mage){
            System.out.println(character);
        }
        System.out.println(" ");

        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {"Миша","Глеб","Георгий","Олег","Иван"};
        for (String name : farmerNames){
            monk.add(new Monk(name));
        }
        for(BaseHero character : monk){
            System.out.println(character);
        }
        System.out.println(" ");


    }
}
