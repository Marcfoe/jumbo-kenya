package java_methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        int largest = findLargest(num1, num2, num3);

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(smallest + " is your smallest number and " + largest + " is your largest number.");

        scanner.close();
    }
