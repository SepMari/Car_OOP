package transport;

import java.time.LocalDate;

public class Car extends Transport {
    public static class Key{
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            if (number == null){
                this.number = "123456789";
            } else {
                this.number = number;
            }

            this.cost = cost;
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length()!=9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, int numberSeats, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.summerTires = true;

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank() || registrationNumber.length() != 9){
            this.registrationNumber = "х000хх000";
        } else this.registrationNumber = registrationNumber;

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "Информация не указана";
        } else this.transmission = transmission;

        if (numberSeats < 0){
            this.numberSeats = 0;
        } else this.numberSeats = numberSeats;

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()){
            this.bodyType = "Информация не указана";
        } else this.bodyType = bodyType;

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else this.engineVolume = engineVolume;

        if(key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "Информация не указана";
        } else this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
            this.registrationNumber = "х000хх000";
        } else this.registrationNumber = registrationNumber;
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void changeTires(){
        summerTires=!summerTires;
    }

    public boolean correctRegNumber() {
        if (registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }


    @Override
    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар");
    }

    public String toString() {
        return  getBrand() + ' '
                + getModel()
                + ", " + getProductionYear()
                + " год выпуска, сборка " + getProductionCountry()
                + ", " + getColor()
                + " цвет, объем двигателя - "  + engineVolume
                + ", коробка передач - " + transmission
                + ", тип кузова - " + bodyType
                + ", регистрационный номер - " + registrationNumber
                + ", количество мест - " + numberSeats
                + ", "  + (getSummerTires() ? "летняя" : "зимняя") + " резина"
                + ", максимальная скорость - " + getMaxSpeed();
    }
}

/*
    если не указана модель, марка машины и страна сборки, то значение по умолчанию — default
    если не указан объем двигателя, то значение по умолчанию — 1,5 л
    цвет кузова по умолчанию — белый
    если не указан год производства, то значение по умолчанию — 2000

        @Override
    public String toString() {
        return
                + engineVolume
                + ", коробка передач - " + transmission
                + ", тип кузова - " + bodyType
                + ", регистрационный номер - " + registrationNumber
                + ", количество мест - " + numberSeats
                + ", "  + (getSummerTires() ? "летняя" : "зимняя") + " резина";
    }
 */
