package autoracing;

import java.time.LocalDate;

public class Car extends Transport implements Competing {

    private BodyType bodyType;
    public enum BodyType {SEDAN, HATCHBACK, COUPE, UNIVERSAL, SUV, CROSSOVER, PICKUP, VAN, MINIVAN};


    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void pintType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип транспорта - " + bodyType);
        }
    }

    @Override
    public void startTraffic() {

    }

    @Override
    public void finishTraffic() {

    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + "/ Car{" +
                "bodyType=" + bodyType +
                '}';
    }
}

/*

 */
