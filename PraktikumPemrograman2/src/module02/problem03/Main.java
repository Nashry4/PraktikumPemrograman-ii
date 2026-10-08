package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        // nilai variable age masih kosong
        e.age = 17;

        System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age + " Tahun");
    }
}
