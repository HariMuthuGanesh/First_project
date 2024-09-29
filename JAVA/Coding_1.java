import java.lang.System;
import java.util.Scanner;

public class Coding_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, address;
        int age;
        float score;

        name = scan.nextLine();
        age = scan.nextInt();
        scan.nextLine();
        address = scan.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My address is " + address);

        int a, b, c, d, e;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        d = a * b * c;
        e = a + b + c;

        System.out.println(d / e);

        score = scan.nextFloat();
        System.out.println(score / 10);

    }
}
