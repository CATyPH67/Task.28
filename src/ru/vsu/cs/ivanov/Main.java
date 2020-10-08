package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = enterNumber('a');
        int b = enterNumber('b');
        System.out.print(sumOfNumberWithEvenOddDigits(a, b));
    }

    private static int enterNumber(char nameOfNumber) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("enter the number %s: ", nameOfNumber);
        return scan.nextInt();
    }

    private static int sumOfNumberWithEvenOddDigits(int a, int b) {
        int sum = 0;
        for (int i = a; i < (b + 1); i++) {
            sum += isNumberWithEvenOddDigits(i);
        }
        return sum;
    }

    private static int isNumberWithEvenOddDigits(int number) {
        int countOfEvenDigits = 0;
        int countOfOddDigits = 0;
        int testNumber = number;
        while (testNumber > 0) {
            if (testNumber % 2 == 0) {
                countOfEvenDigits += 1;
            } else {
                countOfOddDigits +=1;
            }
            testNumber /= 10;
        }
        if (countOfEvenDigits == countOfOddDigits) {
            return number;
        } else {
            return 0;
        }
    }
}
