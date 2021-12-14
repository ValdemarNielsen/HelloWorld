package Lektion9;

import Lektion6.Student;

public class OPG27main {
    public static void main(String[] args) {
        AnsatTAP TAP = new AnsatTAP("Thomas", "DTU", 69);
        System.out.println(TAP.toString());
        String[] kurser = {"dask", "efef", "tæsk", "slask"};
        AnsatVIP VIP = new AnsatVIP("Gustav", "DTU" ,kurser);
        System.out.println(VIP);
        Studerende Studerende = new Studerende("Karl", "s23543");
        System.out.println(Studerende);
    }
}
