package Homework_3_9;

import java.util.Scanner;

class Homework_3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a <= 0 && b <= 0 && c <= 0)
            System.out.println("True");

        else System.out.println("False");
    }
}