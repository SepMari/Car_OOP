package animals;

import java.time.LocalDate;

public abstract class Animals {

    private String nameAnimal;
    private final int birthYearAnimal;


    public Animals(String nameAnimal, int ageAnimal) {
        setNameAnimal(nameAnimal);

        if (ageAnimal >= 0) {
            this.birthYearAnimal = LocalDate.now().getYear() - ageAnimal;
        } else {
            this.birthYearAnimal = LocalDate.now().getYear() - Math.abs(ageAnimal);
        }
    }

    public abstract void eat();

    public abstract void go();

    public abstract void sleep();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        if(nameAnimal == null || nameAnimal.isEmpty() || nameAnimal.isBlank()) {
            this.nameAnimal = "Animal";
        } else this.nameAnimal = nameAnimal;
    }

    public int getBirthYearAnimal() {
        return LocalDate.now().getYear() - birthYearAnimal;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", birthYearAnimal=" + birthYearAnimal +
                '}';
    }
}
