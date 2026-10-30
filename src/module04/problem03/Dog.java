package module04.problem03;

public class Dog extends Pet{
    private String furColor;
    private String ability;

    public Dog (String name, String breed, String furColor, String ability) {
        super(name, breed);
        this.furColor = furColor;
        this.ability = ability;
    }

    public void displayDetailDog() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
        System.out.println("Memiliki kemampuan: " + this.ability);
    }
}