package Module01.problem05;

import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari: ");
        double radius = input.nextDouble();

        System.out.println("Masukkan Tinggi: ");
        double height = input.nextDouble();

        double Phi = 3.14;
        double cylinderVolume = Phi * (radius * radius) * height;

        System.out.printf("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height +
                " cm adalah %.3f m3",cylinderVolume);
    }
}
