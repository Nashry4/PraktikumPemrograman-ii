package Module01.problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.println("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.println("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan Bulan Lahir: ");
        String birthMonth = input.nextLine();

        System.out.println("Masukkan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.println("Masukkan Tinggi Badan: ");
        int bodyHeight = input.nextInt();

        System.out.println("Masukkan Berat Badan: ");
        float bodyWeight = input.nextFloat();

        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + birthMonth + " " + birthYear);
        System.out.println("Tinggi Badan " + bodyHeight + " dan Berat Badan " + bodyWeight);
    }
}