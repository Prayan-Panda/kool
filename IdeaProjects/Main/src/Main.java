import java.util.Scanner;

public class Main {
     public static void main(String[] args) {


    //if statements

         Boolean isStudent;

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter your name: ");
         String name =scanner.nextLine();


         System.out.print("Enter your age: ");
         double age = scanner.nextInt();

         //Group 1
         if (name.isEmpty()){
             System.out.println("You have not written ur name!");
         }
         else{
             System.out.println("Hi "+name+"!");
         }



//Group 2
      if (age >= 65){
          System.out.println("You are a senior citizen!" );
      }

     else if(age >= 18){
         System.out.println("You are an adult!");
       }
     else if (age < 0 ) {
          System.out.println("You are not bron yet!");
      }

     else if (age == 0){
          System.out.println("You are a baby!");
      }

     else{
         System.out.println("You are a child!");
     }


    }
}
