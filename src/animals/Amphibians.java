package animals;

public class Amphibians extends Animals {

    private String livingEnvironment;


    public Amphibians(String nameAnimal, int ageAnimal, String livingEnvironment) {
        super(nameAnimal, ageAnimal);

        setLivingEnvironment(livingEnvironment);
    }

    public void hunt(){
        System.out.println("Без охотя я не выживу.");
    };

    @Override
    public void eat() {
        System.out.println("Ем всякийх таракашек");
    }

    @Override
    public void go() {
        System.out.println("Можем ползать и прыгать");
    }

    @Override
    public void sleep() {
        System.out.println("Можем спасть и ночью, и днем");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Среда проживания не указана";
        } else this.livingEnvironment = livingEnvironment;
    }
}
