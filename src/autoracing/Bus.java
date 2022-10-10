package autoracing;



public class Bus extends Transport implements Competing {

    private Capacity capacity;
    public enum Capacity {
        EXTRASMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        MAXLARGE(100, 120);

        private final int from;
        private final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    };


    public Bus(String brand, String model, float engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void pintType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость транспорта - " + capacity.getFrom() + " до " + capacity.getTo());
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "/ Bus{" +
                "capacity=" + capacity +
                '}';
    }
}
