import java.util.Scanner;

public class GradeStudent
{

    //Input Student details , 3 subject marks and find total percentage and result pass or fail on basis of percentage
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student name: ");
        String name = scanner.next();// Object name as string

        System.out.println("Roll No. :");
        int rollno = scanner.nextInt(); // defining Interger roll

        System.out.println("Hindi: ");
        int hindi = scanner.nextInt();// defining integer hindi

        System.out.println("Gujarati: ");
        int gujarati = scanner.nextInt();// defining integer gujarati

        System.out.println("English: ");
        int english = scanner.nextInt();// defining integer english

        System.out.println("Total: " + (hindi + gujarati + english));

         double percentage = (hindi+gujarati+english)* 100/300;// data type double to define percentage
        System.out.println("Percentage: " + percentage);

        //using nested if else method with Relational operators
        if (percentage>=80)
        {
            System.out.println("Grade: " + "A+");
        }
        else if (percentage >=60)
        {
            System.out.println("Grade: " + "A");
        }
        else if(percentage>=50)
        {
            System.out.println("Grade: " + "B");
        }
        else if (percentage>=35)
        {
            System.out.println("Grade: " + "C");
        }
        else
            {
                System.out.println("Fail");
            }
    }

}