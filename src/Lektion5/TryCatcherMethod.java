package Lektion5;

import java.util.Scanner;

public class TryCatcherMethod {
    public static int Catcher() {

        int pt;
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                pt = input.nextInt();
                if (pt <= 0) {
                    System.out.println("Invalid number");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
        return pt;
    }
}

