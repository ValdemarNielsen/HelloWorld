package Lektion5;

import java.util.Scanner;

public class TryCatcher {
    public static void main(String[] args) {
        System.out.println("Angiv radius og derefter højden på cylinderen. Begge skal være numeriske værdier >0");
        int a = TryCatcherMethod.Catcher();
        int b = TryCatcherMethod.Catcher();
        System.out.println("Rumfanget er; " + (Math.PI * (a * a) * b));

    }
}
