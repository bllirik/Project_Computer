public class PC extends Computer{
    public String caseType;

    PC(String brand, String CPU, String GPU, int RAM, double price, String caseType){
        super(brand, CPU, GPU, RAM, price);
        this.caseType = caseType;
    }
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+getBrand()+"\nCPU: " + getCPU() + "\nGPU: " + getGPU() + "\nRam: " + getRAM() + "GB\nPrice: " + getPrice() + "$\nCase type: " + caseType);
    }
}
