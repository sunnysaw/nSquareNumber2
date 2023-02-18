/*
Question : Java program to find the sum of n square numbers.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit for getting the n square number : ");
        int a,square = 0,sum = 1,result = 0;
        a = sc.nextInt();
        System.out.println("Firstly, printing the square of given number :");
        for (int i = 1; i < a; i++){
            square = sum * sum;
            System.out.print(square + " ");
            sum++;
        }
        System.out.println();
        System.out.println("Finally, printing the result :");
        for (int i = 1; i < a; i++){
            square = sum * sum;
            square += square;
            sum++;
        }
        System.out.print(square);
    }
}