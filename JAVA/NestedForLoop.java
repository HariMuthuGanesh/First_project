public class NestedForLoop {
    public static void main(String args[]) {
        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println("Priya");
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
