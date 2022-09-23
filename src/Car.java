public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;


    public Car(String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this("default", model, engineVolume, color, productionYear, productionCountry);
    }

    public Car(float engineVolume, String color, int productionYear, String productionCountry) {
        this("default", engineVolume, color, productionYear, productionCountry);
    }

    public Car(float engineVolume, String color, int productionYear) {
        this(engineVolume, color, productionYear, "default");
    }

    public Car(float engineVolume, int productionYear) {
        this(engineVolume, "белый", productionYear);
    }

    public Car(float engineVolume) {
        this(engineVolume, 2000);
    }

    public Car() {
        this(1.5f);
    }

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionCountry = productionCountry;

        if (engineVolume < 0) {
            System.out.println("Введено некорректное значение");
        } else if (engineVolume == 0) {
            engineVolume = 1.5f;
        } else this.engineVolume = engineVolume;

        if (productionYear < 0) {
            System.out.println("Введено некорректное значение");
        } else if (productionYear == 0) {
            productionYear = 2000;
        } else this.productionYear = productionYear;
    }


    @Override
    public String toString() {
        return  brand + ' '
                + model
                + ", "
                + productionYear
                + " год выпуска, сборка "
                + productionCountry
                + ", "
                + color
                + " цвет, объем двигателя - "
                + engineVolume;
    }
}

/*
    если не указана модель, марка машины и страна сборки, то значение по умолчанию — default
    если не указан объем двигателя, то значение по умолчанию — 1,5 л
    цвет кузова по умолчанию — белый
    если не указан год производства, то значение по умолчанию — 2000
 */
