import java.util.Scanner;

public class UpperLower
{
    // Switch Uppercase alphabet to Lowercase alphabet
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // defining object
        System.out.println("ENTER IN ALPHABET UPPERCASE:" );
        String ALPHABET= scanner.next(); //defining object Uppercase as ALPHABET

       String alphabet = ALPHABET.toLowerCase(); // defining Java Syntax for lowercase
        System.out.println("enter in alphabet lowercase: " + alphabet);



    }

}
