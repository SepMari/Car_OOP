package transport;

public class Train extends Transport {
    private int tripPrice;
    private int timeTravel;
    private String startStation;
    private String finishStation;
    private int numberOfWagons;


    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 int tripPrice, int timeTravel, String startStation, String finishStation, int numberOfWagons) {
        super(brand,model,productionYear,productionCountry,color,maxSpeed);

        if (tripPrice <= 0) {
            this.tripPrice = 15;
        } else this.tripPrice = tripPrice;

        if (timeTravel < 0) {
            this.timeTravel = Math.abs(timeTravel);
        } else this.timeTravel = timeTravel;

        if (startStation == null || startStation.isEmpty() || startStation.isBlank()) {
            this.startStation = "Информация не указана";
        } else this.startStation = startStation;

        if (finishStation == null || finishStation.isEmpty() || finishStation.isBlank()) {
            this.finishStation = "Информация не указана";
        } else this.finishStation = finishStation;

        if (numberOfWagons < 0) {
            this.numberOfWagons = Math.abs(numberOfWagons);
        } else this.numberOfWagons = numberOfWagons;
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand,model,productionYear,productionCountry,color,maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем");
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice <= 0) {
            this.tripPrice = 15;
        } else this.tripPrice = tripPrice;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        if (timeTravel < 0) {
            this.timeTravel = Math.abs(timeTravel);
        } else this.timeTravel = timeTravel;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (startStation == null || startStation.isEmpty() || startStation.isBlank()) {
            this.startStation = "Информация не указана";
        } else this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        if (finishStation == null || finishStation.isEmpty() || finishStation.isBlank()) {
            this.finishStation = "Информация не указана";
        } else this.finishStation = finishStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons < 0) {
            this.numberOfWagons = Math.abs(numberOfWagons);
        } else this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", tripPrice=" + tripPrice +
                ", timeTravel=" + timeTravel +
                ", startStation='" + startStation + '\'' +
                ", finishStation='" + finishStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }
}
