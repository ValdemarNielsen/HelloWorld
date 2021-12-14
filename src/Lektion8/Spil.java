package Lektion8;
import java.util.Arrays;

public class Spil {
    private Spillekort[] kort;

    public Spil() {
        kort = new Spillekort[52];
        inispil();
    }

    private void inispil() {
// hjælpemetode der initialiserer kort
        int n = 13;
        for (int i = 0; i < kort.length; i++) {
            if (i < 13) {
                kort[i] = new Spillekort('S', i % n);
            } else if (i > 12 && i < 26) {
                kort[i] = new Spillekort('K', i % n);
            } else if (i > 25 && i < 39) {
                kort[i] = new Spillekort('R', i % n);
            } else {
                kort[i] = new Spillekort('H', i % n);
            }

        } /*

        }

        public Kort traekkort() {
// metode der trækker og returnerer øverste kort i bunken og herefter lægger det til sidst i bunken
        }

        public void blandkort() {
// metode der blander kortbunken
        }


     */
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < kort.length; i++) {
            if (kort[i] != null) {
                str += " " + kort[i].toString() + "\n";
            } else {
                str += " Null ";
            }
        }
        return str;
    }

}

