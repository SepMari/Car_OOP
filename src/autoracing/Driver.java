package autoracing;

public abstract class Driver {
    private String fullName;
    private boolean driverLicense;
    private int experience;

    public Driver(String fullName, boolean driverLicense, int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public abstract void startTraffic();

    public abstract void finishTraffic();

    public abstract void refuelTheCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
