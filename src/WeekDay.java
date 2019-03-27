import java.util.Scanner;

public class WeekDay
{
    //Input any number to print Day name of week
    public static void main(String[] args) // main method
    {
        Scanner week= new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7");
        int day;
        day = week.nextInt(); //defining integer day

         // Nested If Else using Logical and Relational Operators
        if (day>0 && day == 1)
        {
            System.out.println("This day is Sunday" );
        }
        else if (day>0 && day == 2)
        {
            System.out.println("This day is Monday");
        }
        else if(day>0 && day ==3)
        {
            System.out.println("This day is Tuesday");
        }
        else if(day >0 && day==4)
        {
            System.out.println("This day if Wednesday");
        }
        else if(day>0 && day==5)
        {
            System.out.println("This day is Thursday");
        }
        else if(day>0 && day==6)
        {
            System.out.println("This day is Friday");
        }
        else if(day>0 && day==7)
        {
            System.out.println("This day is Saturday");
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }

}


