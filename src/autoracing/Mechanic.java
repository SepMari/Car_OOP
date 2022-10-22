package autoracing;

import java.util.Objects;

public class Mechanic<T extends Transport> {

    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t){
        return t.service();
    }

    public void fixTransport(T t){
        t.fixTransport();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("Одинаковые механики " + name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}
