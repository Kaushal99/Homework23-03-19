import java.util.Scanner;

public class TurnOperator
{

     // Input any two numbers and find odd or even using turnery operators
    public static void main(String[] args)
    {

        Scanner scanner =new Scanner(System.in); // defining object
        System.out.println("Enter 1st number: ");
        int x = scanner.nextInt(); // defining number 1
        String test = (x % 2 == 0) ? "even" : "odd"; //defining Turnery operators
        System.out.println(x + " is " + test);

        System.out.println("Enter 2nd number: ");
        int y = scanner.nextInt(); // defining number 2
        String plan = (y % 2== 0 ) ? "even" : "odd"; //defining Turnery operators
        System.out.println(y + " is " + plan);



    }


}
