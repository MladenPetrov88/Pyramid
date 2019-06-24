import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (counter != n) {
                    counter++;
                    System.out.print(counter + " ");
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
