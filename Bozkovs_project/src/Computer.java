import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Computer {
    private String brand;
    private double price;
    private String CPU;
    private String GPU;
    private int RAM;

    Computer(String brand, String CPU, String GPU, int RAM, double price){
        this.brand = brand;
        this.price = price;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public static void writeFile(String content){
        try {
            FileWriter fw = new FileWriter("output.txt",false);
            fw.write(content);
            fw.close();

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static String readFile(String data) {
        try (FileReader reader = new FileReader("output.txt")){
            String result = "";
            int x;
            while ((x = reader.read()) != -1){
                result += (char) x;
            }
            return result;
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void intro() {

        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*     Welcome to computer shop!     *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
    }
    public static void choice() {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose, what you want to do:");
        System.out.println("1) Register \n2) Login \n3) Exit");

        int choice = in.nextInt();
        while (choice > 3 || choice <1) {
            System.out.println("Enter correct number: ");
            choice = in.nextInt();
        }
            switch (choice) {
                case 1:
                    registration();
                    choice();
                case 2:
                    login();
                    catalog();
                case 3:
                    System.exit(0);
                    break;
            }
        }

    public static void catalog() {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose computer type from the list below: ");
        System.out.println("1)PC\n2)Laptop\n3)Tablet");
        int choice = in.nextInt();
        while (choice > 3 || choice <1) {
            System.out.println("Enter correct number: ");
            choice = in.nextInt();
        }
        switch (choice) {
            case 1:

                PC pc1 = new PC("Capital", "intel core i9", "GeForce rtx 4090", 64, 3499.99, "ATX");
                PC pc2 = new PC("Intop", "intel core i7", "GeForce rtx 4060", 32, 1449.99, "ATX");
                PC pc3 = new PC("DELL", "intel core i5", "GeForce rtx 3050", 32, 799.99, "Micro-ATX");

                System.out.println("1) ");
                pc1.printInfo();
                System.out.println("\n2) ");
                pc2.printInfo();
                System.out.println("\n3) ");
                pc3.printInfo();
                System.out.println("\n");

                choice = in.nextInt();
                while (choice > 3 || choice <1) {
                    System.out.println("Enter correct number: ");
                    choice = in.nextInt();
                }
                switch (choice){

                    case 1:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        pc1.printInfo();
                        System.exit(0);
                        break;

                    case 2:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        pc2.printInfo();
                        System.exit(0);
                        break;

                    case 3:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        pc3.printInfo();
                        System.exit(0);
                        break;

                }

            case 2:
                Laptop lp1 = new Laptop("Asus", "intel core i9", "GeForce rtx 4080", 48, 3299.99, "16'");
                Laptop lp2 = new Laptop("Gigabyte", "intel core i7", "GeForce rtx 4060Ti", 32, 1399.99, "15'");
                Laptop lp3 = new Laptop("DELL", "intel core i5", "GeForce rtx 2070", 16, 849.99, "13'");

                System.out.println("1) ");
                lp1.printInfo();
                System.out.println("\n2) ");
                lp2.printInfo();
                System.out.println("\n3) ");
                lp3.printInfo();
                System.out.println("\n");

                choice = in.nextInt();
                while (choice > 3 || choice <1) {
                    System.out.println("Enter correct number: ");
                    choice = in.nextInt();
                }

                switch (choice){

                    case 1:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        lp1.printInfo();
                        System.exit(0);
                        break;

                    case 2:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        lp2.printInfo();
                        System.exit(0);
                        break;

                    case 3:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        lp3.printInfo();
                        System.exit(0);
                        break;

                }

            case 3:
                Tablet tb1 = new Tablet("Apple", "Apple M4", "iebūvēta", 8, 1479.99, 0.446);
                Tablet tb2 = new Tablet("Samsung", "Snapdragon 8", "iebūvēta", 8, 1148.99, 0.572);
                Tablet tb3 = new Tablet("Xiaomi", "Snapdragon 8s", "iebūvēta", 8, 599.99, 0.5);

                System.out.println("1) ");
                tb1.printInfo();
                System.out.println("\n2) ");
                tb2.printInfo();
                System.out.println("\n3) ");
                tb3.printInfo();
                System.out.println("\n");

                choice = in.nextInt();
                while (choice > 3 || choice <1) {
                    System.out.println("Enter correct number: ");
                    choice = in.nextInt();
                }

                switch (choice){

                    case 1:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        tb1.printInfo();
                        System.exit(0);
                        break;

                    case 2:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        tb2.printInfo();
                        System.exit(0);
                        break;

                    case 3:

                        System.out.println("Thank you for choosing our shop for buying one of our products. Here is your product: ");
                        tb3.printInfo();
                        System.exit(0);
                        break;

                }
        }
    }


public static void registration(){
        Scanner in  = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.nextLine();


    System.out.println("Enter your e-mail: ");
    String email = in.nextLine();


    System.out.println("Create your password: ");
    String password = in.nextLine();


    String data = "Name: "+name+"\nE-mail: "+email+"\nPassword: "+password+"\n";
    writeFile(data);

}

public static void login(){
    Scanner in  = new Scanner(System.in);
    int y = 0;
    while (y!=1) {

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your e-mail: ");
        String email = in.nextLine();

        System.out.println("Create your password: ");
        String password = in.nextLine();

        String data = "Name: "+name+"\nE-mail: "+email+"\nPassword: "+password+"\n";

        if (Computer.readFile(data).equals(data)) {
            System.out.println("************************************");
            System.out.println("*                                  *");
            System.out.println("*         Login successful         *");
            System.out.println("*                                  *");
            System.out.println("************************************");
            y++;
        } else {
            System.out.println("Some data is incorrect! Try again!");
        }
    }

}
    public void printInfo(){
        System.out.println("Information about device:\nBrand: "+brand+"\nPrice: "+price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}

