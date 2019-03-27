import java.util.Scanner;

public class LeapYear
{

    // Input any year and find its leap year or not
    public static void main(String[] args)// main method
    {
     Scanner scanner =new Scanner(System.in);// defining object
     System.out.println("Enter the Year:");
     int year = scanner.nextInt(); // defining year integer

        //if else method using relational and assignment operator
     if (year % 4 == 0) // formula to find leap year
     {
     System.out.println(year + " its leap year");
     }
     else
         {
             System.out.println(year + " its not leap year");
         }

    }















}
