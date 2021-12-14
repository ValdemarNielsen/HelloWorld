package Lektion8;
// se spillekortMain for at forstå sammenhæng.
public class Spillekort {
    private char kulør; // S,H,R,K
    private int vaerdi; // 0 til 12

    public Spillekort(char kulør, int vaerdi) {
        /* constructor */
        this.kulør = kulør;
        this.vaerdi = vaerdi;
    }
    public String toString() {
        // toString
        if (this.vaerdi == 0) {
            return ("" + this.kulør + " værdi= es");
        }
        if (this.vaerdi == 10) {
            return ("" + this.kulør + " værdi= knægt");
        }
        if (this.vaerdi == 11) {
            return ("" + this.kulør + " værdi= dronning");
        }
        if (this.vaerdi == 12) {
            return ("" + this.kulør + " værdi= konge");
        }
        else return ""+ this.kulør + " værdi: " + (this.vaerdi+1);
    }
}


