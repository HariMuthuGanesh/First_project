import java.util.Scanner;

public class Coding_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, evencount = 0, oddcount = 0;
        a = scan.nextInt();
        b = scan.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers: " + i);
                evencount++;
            } else {
                System.out.println("Odd numbers: " + i);
                oddcount++;
            }
        }

        System.out.println(evencount);
        System.out.println(oddcount);

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
