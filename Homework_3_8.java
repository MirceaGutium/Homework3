package Homework_3_8;

import java.util.Scanner;

class Homework_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c && b== c)
            System.out.println("True");

        else System.out.println("False");
    }
}