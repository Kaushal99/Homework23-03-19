import java.util.Scanner;

public class CommissionSalary
{
    //Input Sales detail,sales amount,Basic salary then find sales commission
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();

        System.out.println("Sales ID: ");
        String number = scanner.next();

        System.out.println("Sales Amount: ");
        int amount = scanner.nextInt();

        System.out.println("Salary Basic: ");
        int basic = scanner.nextInt();

        System.out.println("Commission: ");

        //using nested if else method with Relational Operators
        if (amount >= 50000 && amount > 30000 )
        {
            System.out.println(amount*35/100);
        }
        else if (amount >= 30000 && amount > 20000)
        {
            System.out.println(amount*20/100);
        }
        else if(amount >= 20000 && amount > 10000)
        {
            System.out.println(amount*10/100);
        }
        else if (amount >= 10000 && amount > 10000){
            System.out.println(amount*5/100);
        }
        else
            {
            System.out.println(10000*2/100);
            }

    }


}
