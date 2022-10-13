package autoracing;



public class Train extends Transport implements Competing {

    private LoadCapacity loadСapacity;
    public enum LoadCapacity {
        N1(0d, 3.5),
        N2(3.5, 12d),
        N3(12d, null);

        private final Double from;
        private final Double to;

        LoadCapacity(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    };

    public Train(String brand, String model, float engineVolume, LoadCapacity loadСapacity) {
        super(brand, model, engineVolume);
        this.loadСapacity = loadСapacity;
    }

    @Override
    public void fixTransport() {

    }

    @Override
    public void pintType() {
        if (loadСapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = loadСapacity.getFrom() == null ? "" : "от " + loadСapacity.getFrom() +" ";
            String to = loadСapacity.getTo() == null ? "" : " до " + loadСapacity.getTo();
            System.out.println("Грузоподъемность транспорта - " + from + to);
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
        System.out.println("Поезд " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
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

    public LoadCapacity getCapacity() {
        return loadСapacity;
    }

    public void setCapacity(LoadCapacity loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "/ Train{" +
                "loadСapacity=" + loadСapacity +
                '}';
    }
}
