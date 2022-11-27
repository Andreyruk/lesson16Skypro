import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 16.");
        person();
        car();
        flower();
    }

    private static Person[] human;

    public static void person() {
        human = new Person[5];
        human[0] = new Person("Максим", -1988, "Минск", "бренд-менеджером");
        human[1] = new Person("Аня", 1993, "Москва", "методистом образовательных программ");
        human[2] = new Person("Катя", 1992, ""/*"Калининград"*/, ""/*"продакт-менеджером"*/);
        human[3] = new Person("Артём", 1995, "Москва", "директором по развитию бизнеса");
        human[4] = new Person("Владимир", LocalDate.now().getYear() - 21, "Казань", "");
//        human[0].setYearOfBirth(1988);
        human[1].setName("");
        human[1].setYearOfBirth(-10);
        acquaintance();
        System.out.println();
    }

    public static void acquaintance() {
//        for (int i = 0; i < human.length; i++) {
//            if (human[i] != null)
//                System.out.println(human[i]);
//        или так
        for (Person human : human) {
            if (human != null)
                System.out.println(human);
        }
    }

    private static Car[] auto;

    public static void car() {
        auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", null/*или 0 и меньше*/, -1.7, "   "/*"жёлтый"*/, "Россия", "механика", "",
                "х123хв456", 5, "зимняя","Удаленный запуск","Бесключевой доступ", LocalDate.of(2030,5,4),20,"5rty48er934gh");
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 2020, 3.0, "чёрный", "Германия", "", "",
                "а123са456", 4, "зимняя","","", LocalDate.of(2010,5,4),20,"512346987");
//        auto[2] = new Car("BMW", "Z8", 2021, 3, "чёрный", "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2018, 2.4, "красный", "Южная Корея", "", "",
                "а123ек456", -6, "зимняя","","", LocalDate.of(2010,5,4),20,"5");
        auto[4] = new Car("Hyundai", "Avante", 2016, -1.6, "оранжевый", ""/*"Южная Корея"*/, "", "",
                "в123ро456", 5, "летняя","","", LocalDate.of(2010,5,4),20,"5");
        auto[4].setRegistrationNumber("s123g#456");
        infoCar();
        System.out.println();
    }

    public static void infoCar() {
//        for (int i = 0; i < auto.length; i++) {
//            if (auto[i] != null)
//        System.out.println(auto[i]);
//        или так
        for (Car auto : auto) {
            if (auto != null) {
                System.out.println(auto);
                System.out.println(auto.getKey());
                System.out.println(auto.getInsurance());
            }

        }
    }

    private static Flower[] flower;

    public static void flower() {
        flower = new Flower[4];
        flower[0] = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        flower[1] = new Flower("Хризантема", "", -15, 5);
        flower[2] = new Flower("Пион", "Англия", 69.9, 1);
        flower[3] = new Flower(""/*"Гипсофила"*/, "Турция", 19.5, 10);
        flower[1].setLifeSpan(0);
        infoFlower();
    }

    public static void infoFlower() {
//        for (int i = 0; i < auto.length; i++) {
//            if (auto[i] != null)
//        System.out.println(auto[i]);
//        или так
        for (Flower flower : flower) {
            if (flower != null)
                System.out.println(flower);
        }
    }
}