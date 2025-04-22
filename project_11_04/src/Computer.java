import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Computer {
    private String brand;
    private double price;

    Computer(String brand, double price){
        this.brand = brand;
        this.price = price;

    }

    public static void writeFile(String content){
        try {
            FileWriter fw = new FileWriter("output.txt",true);
            fw.write(content);
            fw.close();

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

//    public static void clearFile() {
//        try {
//            FileWriter cf = new FileWriter("output.txt", false);
//            cf.write("");
//            cf.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
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
//clearFile();

        System.out.println("Welcome to computer shop!");
    }
    public static void choice(){
        Scanner in = new Scanner(System.in);

        System.out.println("Choose, what you want to do:");
        System.out.println("1)Open product catalog\n2)Register\n3)Login\n4)Exit");

        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Choose computer type from the list below: ");
                System.out.println("1)PC\n2)Laptop\n3)Tablet");
                choice = in.nextInt();
                switch (choice){
                    case 1: String computerType = "PC";
                    writeFile("\nComputer type: "+computerType);
                        choice();
                    case 2:  computerType = "Laptop";
                        writeFile("\nComputer type: "+computerType);
                        choice();
                    case 3: computerType = "Tablet";
                        writeFile("\nComputer type: "+computerType);
                        choice();
                }
            case 2:
                System.out.println("Enter your name: ");
                in.nextLine();
                String name = in.nextLine();
//                writeFile("\nName: "+name);

                System.out.println("Enter your e-mail: ");
                String email = in.nextLine();
//                writeFile("\nE-mail: " + email);

                System.out.println("Create your password: ");
                String password = in.nextLine();
//                writeFile("\nPassword: " + password);

                String data = "Name: "+name+"E-mail: "+email+"Password: "+password;
                writeFile(data);

            case 3:
                int y = 0;
while (y!=1) {
    System.out.println("Enter your name: ");
    in.nextLine();
    name = in.nextLine();

    System.out.println("Enter your e-mail: ");
    email = in.nextLine();

    System.out.println("Create your password: ");
    password = in.nextLine();

    data = "Name: " + name + "E-mail: " + email + "Password: " + password;

    if (Computer.readFile(data).equals(data)) {
        System.out.println(12345);
        y++;
    } else {
        System.out.println("Some data is incorrect! Try again!");
    }
}
            case 4:
                break;

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
}
