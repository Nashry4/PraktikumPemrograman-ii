package module03.problem03;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());
            
            switch(option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String studentName = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean isNimAlreadyExist = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getNim().equals(nim)) {
                            isNimAlreadyExist = true;
                        }
                    }
                    if (isNimAlreadyExist == true) {
                            System.out.println("NIM tersebut sudah ada");
                        } else {
                            students.add(new Student(studentName, nim));
                            System.out.println("Mahasiswa " + studentName + " ditambahkan");
                        }    
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimToRemove = input.nextLine();

                    boolean isNimFound = false;

                    for (int i = 0; i < students.size(); i ++) {
                        if (students.get(i).getNim().equals(nimToRemove)) {
                            isNimFound = true;
                            students.remove(i);

                            System.out.println("Mahasiswa dengan " + nimToRemove + " dihapus");
                        }
                    }
                    if (isNimFound == false) {
                            System.out.println("NIM tidak ditemukan");
                        }    
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimToSearch = input.nextLine();

                    boolean isNimAvailable = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getNim().equals(nimToSearch)) {
                            isNimAvailable = true;
                            
                            System.out.println("NIM: " + students.get(i).getNim() + ", Nama Mahasiswa: " + 
                            students.get(i).getStudentName());
                        }
                    }
                    if (isNimAvailable == false) {
                            System.out.println("Mahasiswa tidak ditemukan");
                        }    
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");

                    for (int i = 0; i < students.size(); i++) {
                        System.out.println("NIM: " + students.get(i).getNim() + " Nama Mahasiswa: " + students.get(i).getStudentName());
                    }
                    break;
                
                case 0:
                    students.clear();
                    System.out.println("Terima Kasih!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
    }
}