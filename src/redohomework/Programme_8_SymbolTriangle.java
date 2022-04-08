package redohomework;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {

    public static void triangleSymbol(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number of Rows");
        triangleSymbol(scanner.nextInt());
        scanner.close();
    }
}