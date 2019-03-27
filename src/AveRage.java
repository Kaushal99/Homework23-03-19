import java.util.Scanner;

public class AveRage
{

    //Input any five number and then find the average of five number
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in); // defining object
        System.out.println("No1: ");
        int no1 = scanner.nextInt();

        System.out.println("No2: ");
        int no2 = scanner.nextInt();

        System.out.println("No3: ");
        int no3 = scanner.nextInt();

        System.out.println("No4: ");
        int no4 = scanner.nextInt();

        System.out.println("No5: ");
        int no5 = scanner.nextInt();
        //defining assingment operator method
        System.out.println("Average: " + (no1+no2+no3+no4+no5)/5);

    }



}
