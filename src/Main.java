public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("Grande", 1.7f, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", 3.0f, "черный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4f, "красный", 2018, "Южная Коррея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Коррея");

        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
    }
}



/*
    3е задание
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