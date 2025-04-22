public class Laptop extends Computer{
    private String displaySize;


    Laptop(String brand, double price, String displaySize){
        super(brand, price);
        this.displaySize = displaySize;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nPrice: "+getPrice()+"\ncaseType: "+displaySize);
    }
}
