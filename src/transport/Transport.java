package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {

        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "Информация не указана";
        } else this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "Информация не указана";
        } else this.model = model;

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()){
            this.productionCountry = "Информация не указана";
        } else this.productionCountry = productionCountry;

        if (color == null || color.isEmpty() || color.isBlank()){
            this.color = "белый";
        } else this.color = color;

        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    public abstract void refill();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            this.color = "белый";
        } else this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}

/*

 */
