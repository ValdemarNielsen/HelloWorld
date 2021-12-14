package Lektion9;

public class Ansat extends Personer {
    public String institutnavn;
    public Ansat(String name, String institutnavn){
    super(name);
    this.institutnavn = institutnavn;
}

    @Override
    public String toString() {
        return super.toString() + " institut= " + institutnavn+ " ";
    }
}
