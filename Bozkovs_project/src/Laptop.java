public class Laptop extends Computer{
    private String displaySize;


    Laptop(String brand, String CPU, String GPU, int RAM, double price, String displaySize){
        super(brand, CPU, GPU, RAM, price);
        this.displaySize = displaySize;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nCPU: " + getCPU() + "\nGPU: " + getGPU() + "\nRam: " + getRAM() + "GB\nPrice: " + getPrice() + "$\nDisplay size: " + displaySize);

    }
}
