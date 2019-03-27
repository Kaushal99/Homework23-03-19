import java.util.Scanner;

public class StudentPass
{
    // Input student details and find 3 subjects marks total,percentage and result
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // defining object
        System.out.println("Enter the Student name: ");
        String name = scanner.next(); // defining name String to object

        System.out.println("Roll No. :");
        int rollno = scanner.nextInt(); // defining integer rollno

        System.out.println("Hindi: ");
        int hindi = scanner.nextInt(); //defining integer for hindi marks

        System.out.println("Gujarati: ");
        int gujarati = scanner.nextInt(); // defining integer for gujarati marks

        System.out.println("English: ");
        int english = scanner.nextInt(); // defining integer for english marks
         int marks = (hindi + gujarati + english); // defining total marks for all subject
        System.out.println("Total: " + marks);

        double percentage = (hindi+gujarati+english)* 100/300; // defining percentage for 3 subjects
        System.out.println("Percentage: " + percentage);


        // using if else using Relational operators
        if(marks<=35)
        {

            System.out.println("Result: " + "Fail");
        }else
        {
        System.out.println("Result: " + "Pass");
        }


    }

}