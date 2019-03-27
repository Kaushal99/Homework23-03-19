import java.util.Scanner;

public class InputNo
{
    //Input any number and feed out is it positive,negative or zero
    public static void main(String[] args)// main method
    {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt(); // defining integer number


        //Nested If Else using Relational operators
        if(number == 0)
        {
            System.out.println("Result: " + "Zero");

        }else if (number <= 0)
        {

            System.out.println("Result: " + "Negative");
        } else
            {
            System.out.println("Result: " + "Positive");
            }


    }












}
