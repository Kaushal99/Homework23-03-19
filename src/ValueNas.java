import java.util.Scanner;

public class ValueNas
{
    // Enter any value to find it is number,alphabet or symbol
    public static void main(String[] args)
    {
        System.out.println("Enter Alphabet,Value or Symbol :"); // defining object
        Scanner scanner = new Scanner(System.in);
        char vl = scanner.next().charAt(0);  //mentioning character

        //define alphabet  ASCII range lowercase : 97-122 & uppercase = 65 - 90
        // using nested if else method with Relational and Logical operators
        if ((vl>=65 && vl >=90) || (vl>=97))
        {
            System.out.println("Alphabet:  ");
        } else if (vl>=48 && vl<=57) // define ASCII range number = 48 - 57
        {
            System.out.println("Number: ");

        }else
            {
            System.out.println("Symbol: ");
            }





    }


}
