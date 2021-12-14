package Lektion9;

public class Studerende extends Personer {
    private String studienummer;

    public Studerende(String name, String studienummer) {
        super(name);
        this.studienummer = studienummer;
    }
    @Override
    public String toString() {
        return super.toString() + "studienummer= "+ studienummer;
    }

}
