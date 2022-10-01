package animals;

public abstract class Mammals extends Animals {

    private String livingEnvironment;
    private final int speedGo;


    public Mammals(String nameAnimal, int ageAnimal, String livingEnvironment, int speedGo) {
        super(nameAnimal, ageAnimal);

        setLivingEnvironment(livingEnvironment);
        this.speedGo = Math.max(speedGo, 0);
    }

    public abstract void walk();


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Среда проживания не указана";
        } else this.livingEnvironment = livingEnvironment;
    }

    public int getSpeedGo() {
        return speedGo;
    }

    @Override
    public String toString() {
        return  super.toString() + "; "
                + "Млекопитающие {" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speedGo=" + speedGo +
                '}';
    }
}
