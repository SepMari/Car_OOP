package animals;

public class Predators extends Mammals {
    private final String typeOfFood;

    public Predators(String nameAnimal, int ageAnimal, String livingEnvironment, int speedGo) {
        super(nameAnimal, ageAnimal, livingEnvironment, speedGo);

        this.typeOfFood = "Хищник - ем все крупное, что бегает";
    }

    public void hunt(){
        System.out.println("Смысл жизни - охота");
    };

    @Override
    public void eat() {
        System.out.println("Я бы тебя съел :*");
    }

    @Override
    public void go() {
        System.out.println("Перемещаемся мы очень быстро и тебе не сбежать ;)");
    }

    @Override
    public void sleep() {
        System.out.println("И днем, и ночью мы охотимся. Между делом спим.");
    }

    @Override
    public void walk() {
        System.out.println("Погуляем?");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return super.toString() + "; " +
                "Хищник {" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
