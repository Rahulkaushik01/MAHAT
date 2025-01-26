import java.util.Scanner;


public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void divide(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("enter valid input !");

        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
    System.out.println(add(5, 10));
    System.out.println(subtract(10, 5));
    System.out.println(multiply(10, 5));
    divide(10, 5);
    divide(0, 5);
    }
}

