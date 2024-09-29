import java.util.Scanner;

public class Coding_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mark;
        mark = scan.nextInt();
        if (mark > 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        int income;
        income = scan.nextInt();
        if (income > 7000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        int num;
        num = scan.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + " is divisible by 3 and 5");
        } else {
            System.out.println(num + " is not divisible by 3 and 5");
        }
    }
}
