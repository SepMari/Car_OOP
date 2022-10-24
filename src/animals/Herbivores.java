package animals;

public class Herbivores extends Mammals {
    private final String typeOfFood;

    public Herbivores(String nameAnimal, int ageAnimal, String livingEnvironment, int speedGo) {
        super(nameAnimal, ageAnimal, livingEnvironment, speedGo);

        this.typeOfFood = "Травоядный - ем все, что растет";
    }

    public void graze() {
        System.out.println("Мы стадные животные и пастимся группами");
    };

    @Override
    public void eat() {
        System.out.println("Я тебя не съем!)");
    }

    @Override
    public void go() {
        System.out.println("Мы перемещаемся быстро");
    }

    @Override
    public void sleep() {
        System.out.println("Спим ночью");
    }

    @Override
    public void walk() {
        System.out.println("Можем погулять вместе");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return super.toString() + "; " +
                "Травоядный {" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
