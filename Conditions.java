import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        System.out.println("age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("welcome");
        } else {
            System.out.println("nilkal");
        }
    }
}
