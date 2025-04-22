public class PC extends Computer{
    public String caseType;

    PC(String brand, double price, String caseType){
        super(brand, price);
        this.caseType = caseType;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nPrice: "+getPrice()+"\ncaseType: "+caseType);
    }
}
