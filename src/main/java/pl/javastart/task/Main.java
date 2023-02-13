package pl.javastart.task;

import java.util.Scanner;

public class Main {
    private static final int RANGE_FROM = 100;
    private static final int RANGE_TO = 200;
    private static final int DIVISION_BY = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isCorrectNumber;

        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
            isCorrectNumber = checkConditions(number);
        } while (!isCorrectNumber);
    }

    private static boolean checkConditions(int number) {
        if (number < RANGE_FROM) {
            System.out.println("Podana liczba jest za mała");
            return false;
        } else if (number > RANGE_TO) {
            System.out.println("Podana liczba jest za duża");
            return false;
        } else if (number % DIVISION_BY != 0) {
            System.out.println("Liczba nie jest podzielna przez " + DIVISION_BY);
            return false;
        }
        System.out.println("Twoja liczba jest ok");
        return true;
    }
}
