package Lektion7;

public class HowOldWillHeBe {
    public static void main(String[] args) {
        CalculateAge(7, 6);
    }

    public static String CalculateAge(int birth, int yearTo) {
        // TODO: your code here
        int age = yearTo - birth;
        if (age == 0) {
            return "You were born this very year!";
        }
        if (age == 1) {
            return "You are 1 year old.";
        }

        if (age == -1) {
            return "You will be born in 1 year.";
        }
        if (age > 0) {
            return "You are " + age + "year(s) old.";
        }
        if (age < 0) {
            return "You will be born in " + age + " year(s).";
        }
        return "fuckoff";
    }

}
