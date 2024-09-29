import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        Random rand = new Random();
        int newnum = 10;

        while (newnum != 0) {
            newnum = rand.nextInt(5);
            System.out.println(newnum);
        }
    }
}
