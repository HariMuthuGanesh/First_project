import java.util.Scanner;
import java.lang.System;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if (a == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scan.nextLine();

        String name;
        name = scan.nextLine();
        if (name.equals("ragavi")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Max of three numbers
        int z, b, c;
        z = 20;
        b = 30;
        c = 50;
        int max = Math.max(c, (Math.max(z, b)));
        System.out.println(max);
    }
}
