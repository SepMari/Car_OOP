package animals;

public class NotFlyBirds extends Birds {
    private String typeGo;

    public NotFlyBirds(String nameAnimal, int ageAnimal, String livingEnvironment) {
        super(nameAnimal, ageAnimal, livingEnvironment);

        this.typeGo = "Не умеем летать, ходим ножками";
    }

    public void walk() {
        System.out.println("Можем погулять вместе");
    }

    @Override
    public void eat() {
        System.out.println("Каждая из нас питается по разному - кто-то рыбу, кто-то насекомых");
    }

    @Override
    public void go() {
        System.out.println("Перемещаемся на ножках/лапах");
    }

    @Override
    public void sleep() {
        System.out.println("Спим когда хотим, а ты не можешь))");
    }

    @Override
    public void hunt() {
        System.out.println("Охота - смысл жизни");
    }

    @Override
    public String toString() {
        return super.toString() + "; " +
                "NotFlyBirds{" +
                "typeGo='" + typeGo + '\'' +
                '}';
    }
}
