import java.util.Scanner;

public class ElseIf_NestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }

        if (num > 0) {
            if (num < 100) {
                System.out.println("Positive & less than 100");
            } else {
                System.out.println("Positive & greater than 100");
            }
        } else {
            System.out.println("Negative");
        }

    }
}
