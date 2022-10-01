import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        taskCar();
        taskAnimal();

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
}



/*

    Поезд Ласточка, модель B-901, 2011 год выпуска в России, скорость передвижения – 301 км/ч,
    отходит от Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки - 3500 рублей, в поезде 11 вагонов

    Поезд Ленинград, модель D-125, 2019 год выпуска в России, скорость передвижения – 270 км/ч,
    отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки - 1700 рублей, в поезде 8 вагонов.


    Создан класс car со свойствами brand, model, engineVolume, color, productionYear, productionCountry
    Создан объект Lada Grande со свойствами класса car
    Создан объекта Audi A8 со свойствами класса car
    Создан объект BMW Z8 со свойствами класса car
    Создан объект Kia Sportage 4 поколение со свойствами класса car
    Создан объект Hyundai Avante со свойствами класса car
    В консоль выводится информация об каждом автомобиле и все указанные характеристики.

    Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
    Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
    BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
    Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
    Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
 */