package Homework_3_4;

import java.util.Scanner;

class Homework_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (h < 0 || a < 0 || b < 0 || h < b || a < b || h > 100 || a > 100 || b > 100)
            System.out.println("Inacceptable");

        else System.out.println(h - a + b/2);
    }
}