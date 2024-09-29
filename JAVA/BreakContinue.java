public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i + "Ragavi");
        }

        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j);
        }
    }
}
