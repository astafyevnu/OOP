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
        ArrayList<BaseHero> TeamOne = new ArrayList<>();
        ArrayList<BaseHero> TeamTwo = new ArrayList<>();
        String[] names = {"Абрам", "Аваз", "Аввакум", "Август", "Августин", "Авдей", "Авенир", "Аверьян", "Авксентий", "Автандил", "Агап",
                "Агафон", "Агей", "Адам", "Адильхан", "Адис", "Адольф", "Адриан", "Азад", "Азамат", "Азар", "Азарий", "Азиз", "Акакий",
                "Аким", "Алан", "Александр", "Алексей", "Али", "Алим", "Алискер", "Алихан", "Алоис", "Алферий", "Альберт", "Альбин", "Альфред",
                "Алянур", "Амадей", "Амадеус", "Амаяк", "Амвросий", "Анастас", "Анатолий", "Анвар", "Ангел", "Андоим", "Андрей", "Андрон",
                "Андроп", "Анжей", "Аникита", "Анисим", "Антип", "Антон", "Ануфрий", "Анфим", "Аполлон", "Арам", "Ардалион", "Арий", "Аристарх",
                "Аристон", "Аркадий", "Арно", "Арнольд", "Арон", "Арсен", "Арсений", "Арслан", "Артамон", "Артем", "Артемий", "Артур", "Артём", "Арулан",
                "Архип", "Аршак", "Аршиддин", "Арье", "Аскар", "Аскольд", "Атанас", "Афанасий", "Афиноген", "Африкан", "Ахмет", "Ашот", "Бадри",
                "Базан", "Байракдар", "Бари", "Барузда", "Батыр", "Бахрам", "Бахыт", "Бежен", "Бек", "Бенедикт", "Берек", "Бернар", "Бертран", "Богдан",
                "Боголюб", "Болеслав", "Бонифаций", "Боримир", "Борис", "Борислав", "Боря", "Боян", "Брачислав", "Бронислав", "Бруно", "Будимир", "Булат",
                "Вавила", "Ваган", "Вадим", "Валентин", "Валера", "Валерий", "Валерьян", "Вали", "Вальтер", "Варлаам", "Варсонофий", "Варфоломей",
                "Василий", "Васим", "Вася", "Велизар", "Велор", "Виктор", "Влад", "Владимир", "Владислав", "Вячеслав", "Георг", "Георгий", "Глеб", "Гордей", "Григорий",
                "Давид", "Даниил", "Даниэль", "Дементий", "Демьян", "Денис", "Дмитрий", "Добрыня", "Евгений", "Егор", "Елисей", "Женя", "Захар",
                "Иван", "Игнат", "Игорь", "Ильдар", "Илья", "Кирилл", "Константин", "Лев", "Леон", "Леонид", "Лука", "Максим",
                "Марат", "Марк", "Марсель", "Матвей", "Мирон", "Мирослав", "Михаил", "Назар", "Никита", "Николай", "Олег", "Павел",
                "Петр", "Платон", "Радик", "Родион", "Рома", "Роман", "Руслан", "Савва", "Савелий", "Святослав", "Семен", "Семён", "Сергей", "Станислав",
                "Стас", "Степа", "Степан", "Тимофей", "Тимур", "Федор", "Филя", "Фёдор", "Эдуард", "Эрик", "Юрий", "Яков", "Ян", "Ярослав"};


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
