package Lektion9;

public class AnsatVIP extends Ansat{
private String[] kurser;
    public AnsatVIP(String name, String insitutnavn, String[] kurser) {
        super(name, insitutnavn);
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        return super.toString() + "kurser= " + kurser(kurser);
    }

    public String kurser(String [] kurs){
        String str = "";
        for (int i = 0; i < kurs.length; i++) {
            str = str + kurs[i] + " ";
        }
        return  str;
    }
}
