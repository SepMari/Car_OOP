package animals;

public abstract class Birds extends Animals {

    private String livingEnvironment;

    public Birds(String nameAnimal, int ageAnimal, String livingEnvironment) {
        super(nameAnimal, ageAnimal);

        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Среда проживания не указана";
        } else this.livingEnvironment = livingEnvironment;
    }

    public abstract void hunt();


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Среда проживания не указана";
        } else this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return super.toString() + "; " +
                "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
