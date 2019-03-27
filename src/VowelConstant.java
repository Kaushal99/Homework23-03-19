import java.util.Scanner;

public class VowelConstant
{

    // Provide single alphabet and it prints it is vowel or consonant
    public static void main(String[] args)
    {

         Scanner scanner = new Scanner(System.in); // defining object
        System.out.println("Input an Alphabet: ");
        char al = scanner.next().charAt(0);  // al represent the character


         // using logical and Relational Operators
        if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u' ||al == 'A' || al == 'E' || al == 'I' || al == 'O' || al == 'U')
        {
            System.out.println("Ita a VOWEL: " + al);
        }else if (al == 'y' || al == 'Y')
        {
            // as alphabet 'Y' is sometime use as Vowels too in words like cry,sky,fly etc...
            System.out.println("Its sometime VOWEL & CONSONANT:  " +al);
        }
        else
            {
               // all other alphabets are called consonant.
              System.out.println("Its a Consonant: ");

            }

    }


}
