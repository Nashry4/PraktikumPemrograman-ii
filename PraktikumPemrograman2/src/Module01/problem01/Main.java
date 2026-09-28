package Module01.problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        String month;
        switch (birthMonth) {
            case 1:
                month = "Januari";
                break;
            case 2:
                month = "Februari";
                break;
            case 3:
                month = "Maret";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "Mei";
                break;
            case 6:
                month = "Juni";
                break;
            case 7:
                month = "Juli";
                break;
            case 8:
                month = "Agustus";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "Oktober";
                break;
            case  11:
                month = "November";
                break;
            case 12:
                month = "Desember";
                break;
            default:
                month = "Bulan Salah";
                break;
        }

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int bodyHeight = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float bodyWeight = input.nextFloat();

        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate +
                " " + month + " " + birthYear);
        System.out.println("Tinggi Badan " + bodyHeight + " cm dan Berat Badan " + bodyWeight + " kilogram");
    }
}