package autoracing;

import java.util.Objects;

public class Driver<T extends Transport> {
    private String fullName;
    private char driverLicense;
    private int experience;
    private T transport;

    public Driver(String fullName, char driverLicense, int experience, T transport) {
        setFullName(fullName);
        setDriverLicense(driverLicense);
        setExperience(experience);
        setTransport(transport);
    }


    public void startTraffic(){
        System.out.println("Старт");
    };

    public void finishTraffic(){
        System.out.println("Тормозим");
    };

    public void refuelTheCar(){
        System.out.println("Заправляемся");
    };

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "default";
        } else this.fullName = fullName;
    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(char driverLicense) {
        if (driverLicense == 'B' || driverLicense == 'C' | driverLicense == 'D') {
            this.driverLicense = driverLicense;
        } else {
            System.out.println("Неверная категория ВУ!");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            System.out.println("Неверное значение стажа вождения!");
        } else this.experience = experience;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {

        boolean f;
        switch (getDriverLicense()) {
            case 'B':
                f = transport instanceof Car;
                break;
            case 'C':
                f = transport instanceof Bus;
                break;
            case 'D':
                f = transport instanceof Train;
                break;
            default:
                throw new IllegalArgumentException("Неверная категория прав");
        }

        if (f) {
            this.transport = transport;
        } else {
            System.out.println("Не совпадает категория прав и управляемый трансопрт!" + transport);
        }
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("Одинаковые водители " + fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience, transport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "водитель " + fullName +
                ", управляет автомобилем " + transport.getBrand() + ' ' + transport.getModel() +
                " и будет участвовать в заезде}";
    }
}
