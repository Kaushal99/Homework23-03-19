import java.sql.SQLOutput;
import java.util.Scanner;

public class InterChange
{

    // Input two number and print there interchanges values
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner scanner= new Scanner(System.in);//defining method
        System.out.println("Enter value x: ");
        x = scanner.nextInt();
        System.out.println("Enter value y: ");
        y = scanner.nextInt();

        System.out.println("Before intervalue x,y:  "+x+" + "+y);
        // interchanging the value of x and y by creating z as third integer
        z = x;
        x = y;
        y = z;

        // using Unary operators
        System.out.println("After intervalue x,y : "+x+" + " +y);


    }



}
