import java.util.Scanner;

public class InputMethods {
    public static void main(String[] args) {

        // Using Scanner Class
        Scanner scan = new Scanner(System.in);

        byte b;
        b = scan.nextByte();
        System.out.println(b);

        short s;
        s = scan.nextShort();
        System.out.println(s);

        int a;
        a = scan.nextInt();
        System.out.println(a);

        long l;
        l = scan.nextLong();
        System.out.println(l);

        float f;
        f = scan.nextFloat();
        System.out.println(f);

        double d;
        d = scan.nextDouble();
        System.out.println(d);

        String str;
        str = scan.next();
        System.out.println(str);

        boolean bool;
        bool = scan.nextBoolean();
        System.out.println(bool);
    }
}
