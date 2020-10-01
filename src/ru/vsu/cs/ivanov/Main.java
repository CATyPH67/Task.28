package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = enterNumber('a');
        int b = enterNumber('b');
        System.out.print(sumOfNeededNumber(a, b));
    }

    private static int enterNumber(char nameOfNumber) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("enter the number %s: ", nameOfNumber);
        return scan.nextInt();
    }

    private static int sumOfNeededNumber(int a, int b) {
        int sum = 0;
        for (int i = a; i < (b + 1); i++) {
            sum += isNeededNumber(i);
        }
        return sum;
    }

    private static int isNeededNumber(int number) {
        int countOfEvenNumber = 0;
        int countOfOddNumber = 0;
        int testNumber = number;
        while (testNumber > 0) {
            if (testNumber % 2 == 0) {
                countOfEvenNumber += 1;
            } else {
                countOfOddNumber +=1;
            }
            testNumber /= 10;
        }
        if (countOfEvenNumber == countOfOddNumber) {
            return number;
        } else {
            return 0;
        }
    }
}
