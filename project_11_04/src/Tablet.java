public class Tablet extends Computer{
    private boolean keyboardIncluded;


    Tablet(String brand, double price, boolean keyboardIncluded){
        super(brand, price);
        this.keyboardIncluded = keyboardIncluded;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nPrice: "+getPrice()+"\ncaseType: "+keyboardIncluded);
    }
}
