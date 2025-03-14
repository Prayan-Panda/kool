import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

              //Calculate the area of a rectangle

           double length = 0;
                   double width = 0;
            double area = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length- ");
            length = scanner.nextDouble();

        System.out.print("Enter the width- ");
        width = scanner.nextDouble();

       area = length * width;

        System.out.println("The area is "+area +"cm^2");





            scanner.close();

    }
}
