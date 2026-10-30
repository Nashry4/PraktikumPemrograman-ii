package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis hewan yang ingin diinputkan:");
            System.out.println("1 = Kucing");
            System.out.println("2 = Anjing");
            
            System.out.print("Masukkan Pilihan: ");
            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Nama Hewan Peliharaan: ");
                    String nameCat = input.nextLine();

                    System.out.print("Ras: ");
                    String breedCat = input.nextLine();

                    System.out.print("Warna Bulu: ");
                    String furColorCat = input.nextLine();

                    Cat cat = new Cat(nameCat, breedCat, furColorCat);

                    cat.displayDetailCat();
                    break;

                case 2:
                    System.out.print("Nama Hewan Peliharaan: ");
                    String nameDog = input.nextLine();

                    System.out.print("Ras: ");
                    String breedDog = input.nextLine();

                    System.out.print("Warna Bulu: ");
                    String furColorDog = input.nextLine();

                    System.out.print("Kemampuan: ");
                    String ability = input.nextLine();

                    Dog dog  = new Dog(nameDog, breedDog, furColorDog, ability);

                    dog.displayDetailDog();
                    break;

                default:
                    break;
            }
        }
    }
}