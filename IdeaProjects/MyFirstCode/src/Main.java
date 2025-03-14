import java.util.Scanner;

public class Main {

public static void main(String[] args ){

       // THIS IS MY FIRST JAVA PROGRAM.
       /*
       You
        bye
        me
        a
        pizza
        */
        //int is a single integer value and not a rational number.For example:-1,2,48 etc.
         /*
         double is multi values rational numbers like 19.99.
         char is characters (alphabets) like see below!
         boolean is used to declare something as true or false see below!
          */

 int age = 70;
 int year = 2025;
 int quantity = 5;

 double price = 19.99;
 double gpa = 3.5;
 double temperature = -12.6;

 char grade = 'A';
 char currency ='$';
 char symbol ='!';

 boolean isStudent = true;
boolean  isOnline = false;
boolean forSale = true;

String name = "Bro Code";
String food = "pizza";
String email = "fake123@gmail.com";
String car = "land rover";
String color = "red";



                 System.out.print("I like burger!\n");
                 System.out.print("It is really good!\n");
                 System.out.print("So buy me some pizza pls.\n");
                 System.out.println("My age is 7");

                 System.out.println("The year is " + year);
                 System.out.println("My age is "+age);
                 System.out.println(quantity + " is a small number");

                 System.out.println("$"+price);
                 System.out.println("Your GPA is " + gpa );
                 System.out.println("The temperature of Mumbai is " + temperature);

                 System.out.println("His grade is "+ grade);
                 System.out.println("He only uses "+currency);
                 System.out.println("I don't want this to happen"+symbol);

                 System.out.println(isStudent);
                 System.out.println(isOnline);
                 System.out.println(forSale);

                 System.out.println("His name is "+ name);
                 System.out.println("He likes "+ food);
                 System.out.println("Your email is :- "+ email);
                 System.out.println("Your favourite care is "+car);
                 System.out.println("You like a "+ color + " colored t-shirt");

                 if(forSale){
                     System.out.println("The "+ car + " is for sale");
                 }
                 else{
                     System.out.println("The "+ car + " is not for sale");
                 }

                 Scanner scanner =new Scanner(System.in);

                 System.out.print("Enter your name:- ");
                String bro = scanner.nextLine();

    System.out.print("Enter ur age: ");
    int old = scanner.nextInt();

    System.out.print("Enter ur GPA:- ");
    double GPA = scanner.nextDouble();

    System.out.println("Are u a doctor (True/False)");
    boolean isDoctor =  scanner.nextBoolean();

    System.out.println("Hello "+ bro);

    System.out.println("You are "+ old +" years old.");

    System.out.println("Your G.P.A is "+ GPA);

    if(isDoctor){
        System.out.println("You are enrolled as a Doctor.");
    }
    else{
        System.out.println("You are NOT enrolled as a Doctor.");
    }




                 scanner.close();


    }
}