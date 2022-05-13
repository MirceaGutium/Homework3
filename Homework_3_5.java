package Homework_3_5;

import java.util.Scanner;

class Homework_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int time = scanner.nextInt();
        System.out.println("Average speed of the bus is" + " " + (distance / time) + "km/hour");
    }
}