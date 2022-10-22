package autoracing;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;
    private final Set<Driver <?>> drivers = new HashSet<>();
    private final Set<Mechanic <?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

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

    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public abstract void fixTransport();

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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
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
