package module02.problem03;

// Error terjadi karane nama class tidak sama dengan nama file.
// public class Pegawai {
public class Employee {
    public String name;
    // Tipe data yang digunakan seharusnya adalah String bukan char, kalau char kita hanya bisa memasukkan satu huruf/karakter saja.
    // public char origin;
    public String origin;
    public String role;
    public int age;


    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    } 

    // Setter harus mempunyai parameter
    // public void setRole() {
    public void setRole(String role) {
        // r tidak bisa digunakan karena tidak ada variable yang bernama r di sini.
        // this.role = r;
        this.role = role;
    }
}
