package module02.problem02;

public class Coffee {
    private String name;
    private String size;
    private double price;
    private String customer;

    public void printInfo() {
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTax() {
        double coffeTax = 0.11;
        
        return price * coffeTax;
    }
}
