import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Author MB = new Author("Michelle Barack", "michelle.barack@gmail.com", 'f');
        Author MT = new Author("Mike Tyson", "mike.tyson@gmail.com", 'm');
        Book MB1 = new Book("The Mouse", MB, 25, 300);
        Book MB2 = new Book("Rayan's Big Bunda", MB, 30, 1000000);
        Book MT1 = new Book("Suss's secret recipe", MT, 20, 30);
        Book MT2 = new Book("Sevil and TE20E", MT, 10, 200);

        System.out.println("Welcome to the library!");
        System.out.println("We currently have 4 books and 2 authors.");
        System.out.println("Type 1 to see their details");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("Here are our authors and their books:");
            System.out.println("____________");
            System.out.println("Michelle Barack (female)");
            System.out.println("Email: michelle.barack@gmail.com");
            System.out.println("Name of books: " + MB1.getName() + " and " + MB2.getName());
            System.out.println("Price (USD): " + MB1.getPrice() + " and " + MB2.getPrice());
            System.out.println("Amount of copies: " + MB1.getQty() + " and " + MB2.getQty());
            System.out.println("----------------------");
            System.out.println("Mike Tyson (male)");
            System.out.println("Email: mike.tyson@gmail.com");
            System.out.println("Name of books: " + MT1.getName() + " and " + MT2.getName());
            System.out.println("Price (USD): " + MT1.getPrice() + " and " + MT2.getPrice());
            System.out.println("Amount of copies: " + MT1.getQty() + " and "+ MT2.getQty());
        }
    }
}