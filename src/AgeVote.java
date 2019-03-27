import java.util.Scanner;

public class AgeVote
{
    // Input his/her age if age is over 18 person should be eligible to vote or under 18 will not
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);
        String Name;
        int age;
        System.out.println("My name is: ");
        Name=scanner.next();
        System.out.println("My age is: ");
        age=scanner.nextInt();

       // If Else method using Relational operators
        if(age>=18)
        {
            System.out.println("You eligible to vote.");
        }else{
            System.out.println("You Not-eligible to Vote.");
        }




    }
}
