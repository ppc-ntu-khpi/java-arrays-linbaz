package test;

import domain.*;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть мінімальне число");
        int min = scanner.nextInt();
        System.out.println("Введіть максимальне число");
        int max = scanner.nextInt();
        System.out.println("Введіть кількість комірок");
        int num = scanner.nextInt();
        Exercise.Calculate(min, max, num);

    }
}