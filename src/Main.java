import animals.*;
import autoracing.Driver;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
//        taskCar();
//        taskAnimal();
        taskAutoracing();

    }

    private static void taskCar() {
        Car ladaGrande = new Car("Lada", "Grande",1.7f, "желтый", 2015, "Россия", "механика", "седан", "м136вр777", 4, 200);
        Car audiA8 = new Car("Audi","", 3.0f, "черный", 2020, "Германия", "механика", "седан", "5136вр7377", 4, 350);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия", "механика", "седан", "м136вр777", 4,400);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4f, "красный", 2018, "Южная Коррея", "механика", "седан", "м136вр777", 4, 400);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Коррея", "механика", "седан", "м136вр777", 4, 250);

        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);

        ladaGrande.refill();

        System.out.println();


        Train lastochka = new Train("Поезд Ласточка", "B-901",2011,"Россия","",301,3500,0, "Беларусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Поезд Ленинград", "D-125", 2019, "", "", 270, 1700, 5, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);

        lastochka.refill();

        System.out.println();


        Bus bmwZ5 = new Bus("BMW", "Z5",2005, "", "желтый", 250);
        Bus bmwM5 = new Bus("BMW", "M5",2003, "", "желтый", 250);
        Bus bmwD4 = new Bus("BMW", "D5",2015, "", "желтый", 300);

        System.out.println(bmwZ5);
        System.out.println(bmwM5);
        System.out.println(bmwD4);

        bmwZ5.refill();
    }

    private static void taskAnimal() {
        Herbivores horse = new Herbivores("Звезда", 5, "Ранчо", 16);

        System.out.println(horse);
        horse.eat();
        horse.sleep();
        horse.go();
        horse.walk();
        horse.graze();

        Predators tiger = new Predators("Ррмяу", 6, "Африка", 45);

        System.out.println(tiger);
        tiger.sleep();
        tiger.go();
        tiger.hunt();
        tiger.eat();
        tiger.walk();

        Amphibians frog = new Amphibians("Квакушка", 2, "Пруд");

        System.out.println(frog);
        frog.hunt();
        frog.eat();
        frog.sleep();
        frog.go();

        FlyBirds gull = new FlyBirds("Чайка Аааа", 1, "");

        System.out.println(gull);
        gull.eat();
        gull.hunt();
        gull.go();
        gull.sleep();

        NotFlyBirds penguin = new NotFlyBirds("Пингвин Пин", 2, "");

        System.out.println(penguin);
        penguin.eat();
        penguin.hunt();
        penguin.go();
        penguin.sleep();
    }

    private static void taskAutoracing() {
        autoracing.Car ladaGrande = new autoracing.Car("Lada", "Grande",1.7f);
        autoracing.Car audiA8 = new autoracing.Car("Audi","", 3.0f);
        autoracing.Car bmwZ8 = new autoracing.Car("BMW", "Z8", 3.0f);
        autoracing.Car kiaSportage4 = new autoracing.Car("Kia", "Sportage 4", 0);
        autoracing.Car hyundaiAvante = new autoracing.Car("Hyundai", "Avante", 1.6f);

//        System.out.println(ladaGrande);
//        System.out.println(audiA8);
//        System.out.println(bmwZ8);
//        System.out.println(kiaSportage4);
//        System.out.println(hyundaiAvante);
//
//        System.out.println();


        autoracing.Train lastochka = new autoracing.Train("Поезд Ласточка", "B-901",1.1f);
        autoracing.Train leningrad = new autoracing.Train("Поезд Ленинград", "D-125", 2.1f);

//        System.out.println(lastochka);
//        System.out.println(leningrad);
//
//        System.out.println();


        autoracing.Bus bmwZ5 = new autoracing.Bus("BMW", "Z5",1.6f);
        autoracing.Bus bmwM5 = new autoracing.Bus("BMW", "M5",1.3f);
        autoracing.Bus bmwD4 = new autoracing.Bus("BMW", "D5",1.5f);

//        System.out.println(bmwZ5);
//        System.out.println(bmwM5);
//        System.out.println(bmwD4);


        Driver<autoracing.Car> petr = new Driver<>("Петр", 'B', 1, bmwZ8);
        System.out.println(petr);

        Driver<autoracing.Bus> ivan = new Driver<>("Иван", 'C', 3, bmwM5);
        System.out.println(ivan);

        Driver<autoracing.Train> make = new Driver<>("Майк", 'D',7, lastochka);
        System.out.println(make);
    }
}



/*

 */