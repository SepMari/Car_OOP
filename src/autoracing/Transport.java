package autoracing;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "Информация не указана";
        } else this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "Информация не указана";
        } else this.model = model;

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else this.engineVolume = engineVolume;
    }

    public abstract void pintType();

    public abstract void startTraffic();

    public abstract void finishTraffic();

    public abstract boolean service();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}

/*

 */
