import java.util.Scanner;

public class FizzBuzz{


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("What is the integer for FizzBuzz: ");
        
        while(true){
            try{
                num = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.print("\n\nPlease enter an integer: ");
            }

        }
        scanner.close();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (num % 5 == 0){
            System.out.println("Buzz");
        }
        else if (num % 3 == 0){
            System.out.println("Fizz");
        }
    }
}