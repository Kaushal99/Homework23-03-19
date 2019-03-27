import java.util.Scanner;

public class SalaryEmp
{

    // Input employee detail,basic salary find HRA,TA,DA,PF and Gross salary of
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);// defining object
        System.out.println("Name");
        String name = scanner.next(); //defining String name as object

        System.out.println("Emplyoed ID");
        String number = scanner.next(); //defining String number as object

        System.out.println("Basic Salary");
        int s = scanner.nextInt(); // defining interger s as object

        double Hra = (s*10/100); //defining double data type 10% HRA
        System.out.println("HRA: "+ Hra);

        double Da = (s*8/100); // defining double data type 8% DA
        System.out.println("DA: " + Da);

        double Ta = (s*9/100); // defining double data type to find 9% TA
        System.out.println("TA: " + Ta);

        double Pf = (s*20/100); // defining double data type to find 20% PF
        System.out.println("PF: " + Pf);

        // Using assingment operator
        System.out.println("Gross Salary: " + (Hra+Da+Ta+Pf));


    }



}
