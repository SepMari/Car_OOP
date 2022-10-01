package animals;

public class FlyBirds extends Birds {
    private String typeGo;

    public FlyBirds(String nameAnimal, int ageAnimal, String livingEnvironment) {
        super(nameAnimal, ageAnimal, livingEnvironment);

        this.typeGo = "Умеем летать";
    }

    @Override
    public void eat() {
        System.out.println("Едим насекомых");
    }

    @Override
    public void go() {
        System.out.println("Перемещаемся по воздуху");
    }

    @Override
    public void sleep() {
        System.out.println("Некоторые из нас спят ночь, другие днем");
    }

    @Override
    public void hunt() {
        System.out.println("Охота - смысл жизни");
    }

    @Override
    public String toString() {
        return super.toString() + "; " +
                "FlyBirds{" +
                "typeGo='" + typeGo + '\'' +
                '}';
    }
}
