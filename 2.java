
// Write a Java program which would take two values through command line
// argument and print the sum of the two values.

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value :");
        int a = sc.nextInt();
        System.out.print("Enter the b value :");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }
}