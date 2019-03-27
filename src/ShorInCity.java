import java.util.Scanner;

public class ShorInCity
{
   // Input any alphabets between a & f to get city name accordingly
    public static void main(String[] args)
    {
        //defining object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show City name : ");
        String city = scanner.next(); //defining city names

        //nested if else method using stack equal
        if(city.equals("a"))
        {
            System.out.println("Assam");
        }
        else if (city.equals("b"))
        {
            System.out.println("Baroda");
        }
        else if (city.equals("c"))
        {
            System.out.println("Calcutta");
        }
        else if (city.equals("d"))
        {
            System.out.println("Darjeling");
        }
        else if (city.equals("e"))
        {
            System.out.println("Europe");
        }
        else if (city.equals("f"))
        {
            System.out.println("Faridabad");
        }
        else
            {
            System.out.println("Alphabet is invalid");
            }
    }
}