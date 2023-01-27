import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int rNum = r.nextInt(4);
            int rName = r.nextInt(names.length);
            if (rNum == 0) {
                TeamOne.add(new Peasant(names[rName]));
            } else if (rNum == 1) {
                TeamOne.add(new Rogue(names[rName]));
            } else if (rNum == 2) {
                TeamOne.add(new Sniper(names[rName]));
            } else {
                TeamOne.add(new Mage(names[rName]));
            }
        }

        for (int i = 0; i < 10; i++) {
            int rNum = r.nextInt(4);
            int randNameNum = r.nextInt(names.length);
            if (rNum == 0) {
                TeamTwo.add(new Peasant(names[randNameNum]));
            } else if (rNum == 1) {
                TeamTwo.add(new Spearman(names[randNameNum]));
            } else if (rNum == 2) {
                TeamTwo.add(new Crossbowman(names[randNameNum]));
            } else {
                TeamTwo.add(new Monk(names[randNameNum]));
            }
        }

        ArrayList<BaseHero> sortedTeamOne = sortParty(TeamOne);
        ArrayList<BaseHero> sortedArmyTwo = sortParty(TeamTwo);

        System.out.printf("Press enter to continue!\n");
        Scanner scan = new Scanner(System.in);
        boolean startApp = true;
        while (startApp) {
            if (scan.nextLine().contains("exit")) {
                startApp = false;
            } else {
                sortedTeamOne.forEach(n -> System.out.print(n.getInfo() + ", "));
                sortedTeamOne.forEach(n -> n.step(sortedTeamOne));

                System.out.println(" ");

            }
        }
    }

//    public static void getHeroes(ArrayList<BaseHero> heroes, String neededClass) {
//        int count = 0;
//        for (BaseHero hero : heroes) {
//            if (hero.toString().contains(neededClass)) {
//                count++;
//                System.out.println(count + ". " + hero);
//            }
//        }
//        if (count == 0) {
//            System.out.printf("Героев класса %s не нашлось.\n", neededClass);
//        }
//    }

    public static ArrayList<BaseHero> sortParty(ArrayList<BaseHero> heroes) {
        ArrayList<BaseHero> resArray = new ArrayList<>();
        for (BaseHero hero : heroes) {
            if (hero.getInfo().contains("Monk") || hero.getInfo().contains("Mage")) {
                resArray.add(hero);
            }
        }
        for (BaseHero hero : heroes) {
            if (!(hero.getInfo().contains("Peasant") || hero.getInfo().contains("Monk") || hero.getInfo().contains("Mage"))) {
                resArray.add(hero);
            }
        }
        for (BaseHero hero : heroes) {
            if (hero.getInfo().contains("Peasant")) {
                resArray.add(hero);
            }
        }
        return resArray;
    }

}