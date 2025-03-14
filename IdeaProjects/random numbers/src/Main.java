import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Random random=new Random();
    Scanner scanner = new Scanner(System.in);
    int number;

        System.out.println("Enter ur number: ");
         int isNumber = scanner.nextInt();

     if(isNumber) {
         number = random.nextInt(-111, 99);
     }

        System.out.println(number);
    }
}