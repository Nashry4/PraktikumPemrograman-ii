package Module01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan N dan Bilangan Awal: ");
        int manyLine = input.nextInt();
        int firstNumber = input.nextInt();

        int i = 0;

        do {
            if (firstNumber % 2 != 0) {
                System.out.print(firstNumber);
                if (i < manyLine * 2 - 2) {
                    System.out.print(", ");
                }
            }

            firstNumber++;
            i++;

        } while (i < manyLine * 2);
    }
}
