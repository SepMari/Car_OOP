package autoracing;

public class Sponsor {

    private String name;
    private int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }

    public void toSponsor(){
        System.out.printf("Спонсор %s спонсировал заезд %d%n", name, supportAmount);
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }
}
