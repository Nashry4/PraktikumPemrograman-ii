package module03.problem02;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah negara: ");
        int numberOfCountries = Integer.parseInt(input.nextLine());
        
        LinkedList<Country> countries = new LinkedList<>();
        for (int i = 0; i < numberOfCountries; i++) {
            System.out.print("Nama negara: ");
            String countryName = input.nextLine();

            System.out.print("Jenis kepemimpinan: ");
            String leadingType = input.nextLine();

            System.out.print("Nama pemimpin: ");
            String leaderName = input.nextLine();

            if (leadingType.equals("monarki")) {
                countries.add(new Country(countryName, leadingType, leaderName));
                continue;
            }
            System.out.print("Tanggal kemerdekaan: " );
            int independenceDate = Integer.parseInt(input.nextLine());

            System.out.print("Bulan kemerdekaan: ");
            int independenceMonth = Integer.parseInt(input.nextLine());

            System.out.print("Tahun kemerdekaan: ");
            int independenceYear = Integer.parseInt(input.nextLine());

            countries.add(new Country(countryName, leadingType, leaderName, independenceDate, independenceMonth, independenceYear));
        }

        for (Country country : countries) {
            System.out.println();
            country.printInfo();
        }  
    }
}
