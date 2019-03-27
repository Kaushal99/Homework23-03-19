import java.util.Scanner;

public class SymbolCalculator
{
    // Input any 2 numbers and use symbols ( +,-,*&/) to find addition,substraction,divide and multiple
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);  //defining object
        System.out.println("Enter Integer a: ");
        int a = scanner.nextInt(); // defining integer for a

        System.out.println("Enter Integer b: ");
        int b = scanner.nextInt(); // defining inetger for b

        System.out.println("Enter any symbol: ");
        char sy = scanner.next().charAt(0); //defining character object sy


        //Nested If Else using Equality operators
        if (sy == '+') // defining if symbol is  '+' addition
        {
            System.out.println("Addition "+a+"+"+b+" :  " + (a+b) );
        }else if (sy == '-') // defining if symbol is '-' substraction
        {
            System.out.println("Substraction of "+a+"-"+b+" :  " + (a-b));
        }else if (sy == '*') // defining if symbol is '*' multiplication
        {
            System.out.println("Multiple "+a+" * "+b+" :   " + (a*b) );
        }else if (sy == '/') // defining if symbol is '/' divided
        {
            System.out.println("Division "+a+" / "+b+":  " + (a/b));
        }
        else
            {
            System.out.println("Invalid");
            }









    }











}
