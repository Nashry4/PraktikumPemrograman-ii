package Module01.problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        char[] abuOption = new char[3];

        System.out.println("Tangan Abu: ");

        for (int i = 0; i < 3; i++) {
            abuOption[i] = input.next().charAt(0);
        }

        char[] bagasOption = new char[3];

        System.out.println("Tangan Bagas: ");

        for (int i = 0; i < 3; i++) {
            bagasOption[i] = input.next().charAt(0);
        }

        int abuPoint = 0;
        int bagasPoint = 0;

        for (int i = 0; i < 3; i++) {
            if ((abuOption[i] == 'G' && bagasOption[i] == 'K') || (abuOption[i] == 'B' && bagasOption[i] == 'G') ||
                    (abuOption[i] == 'K' && (bagasOption[i] == 'B')))
            {
                abuPoint++;
            }

            if ((abuOption[i] == 'G' && bagasOption[i] == 'B' ) || (abuOption[i] == 'K' && bagasOption[i] == 'G') ||
                    (abuOption[i] == 'B' && bagasOption[i] == 'K')) {
                bagasPoint++;
            }
        }

        if (abuPoint > bagasPoint) {
            System.out.println("Abu");
        }

        if (bagasPoint > abuPoint) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
