public class Tablet extends Computer{
    private double weight;


    Tablet(String brand, String CPU, String GPU, int RAM, double price, double weight){
        super(brand, CPU, GPU, RAM, price);
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nCPU: " + getCPU() + "\nGPU: " + getGPU() + "\nRam: " + getRAM() + "GB\nPrice: " + getPrice() + "$\nWeight: " + weight + "kg");
    }
}
