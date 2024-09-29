import java.util.Scanner;

public class Coding_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        score = scan.nextInt();

        if (score < 50) {
            System.out.println("You need to improve");
        } else if (score >= 50 && score <= 70) {
            System.out.println("Good job");
        } else {
            System.out.println("Excellent Performance");
        }

        int s1, s2, s3, s4, s5, avg;
        s1 = scan.nextInt();
        s2 = scan.nextInt();
        s3 = scan.nextInt();
        s4 = scan.nextInt();
        s5 = scan.nextInt();

        avg = (s1 + s2 + s3 + s4 + s5) / 5;

        if (avg < 35) {
            System.out.println("Additional class is required");
        } else {
            System.out.println("You are good to go");
        }

        String color;
        color = scan.nextLine();

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Get Ready");
        } else {
            System.out.println("Go");
        }

        int salary, age;
        salary = scan.nextInt();
        age = scan.nextInt();

        if (salary >= 20000 || age <= 25) {
            System.out.println("Eligible for loan");
            int loan;
            loan = scan.nextInt();
            if (loan <= 50000) {
                System.out.println("You are eligible for loan");
            } else {
                System.out.println("Max loan amount is 50000");
            }
        } else {
            System.out.println("You are not eligible for loan");
        }
    }
}
