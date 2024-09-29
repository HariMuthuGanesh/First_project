import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        Scanner scan = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Enter the number > 10::");
            a = scan.nextInt();
        } while (a < 10);
    }
}
