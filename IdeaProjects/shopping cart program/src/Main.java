import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        //SHOPPING CART PROGRAM

        Scanner scanner = new Scanner (System.in);

        String item;
        double price;
       int quantity;
        char currency='$';
        double total;

        System.out.print("What item would u like to buy? Maybe fries?;) : ");
        item = scanner.nextLine();

        System.out.print("What is the price that u want to buy for: ");
        price = scanner.nextDouble();

        System.out.print("How many do u want buy?: ");
        quantity = scanner.nextInt();

        total = price*quantity;

        System.out.println("\nYou have bought "+quantity+ " " + item +"/s");
        System.out.println("congrats you have bought " + quantity + " "+item +"/s for " + total + currency );




        scanner.close();


     }
    }
