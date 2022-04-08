package redohomework;

import java.util.Scanner;

public class Programme_9_FibonacciNumber {

    public static void isFibonacciNumber(int count) {
        int n1 =0, n2=1, n3;
        System.out.print( +n1 + " " + n2);
        //loop start from 2 because 0 and 1 are already printed
        for (int i =2; i<count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Fibonacci number count:  ");
        isFibonacciNumber(scanner.nextInt());
        scanner.close();
    }
}
