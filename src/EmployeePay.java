import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args){
        int empnum;
        double payrate;
        double hours;
        double employpay;
        double overtimeh;
        double overtimepr;
        double overtimetotal;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter employee number: ");
        empnum = key.nextInt();
        Scanner key1 = new Scanner(System.in);
        System.out.print("Please enter payrate: ");
        payrate = key1.nextDouble();
        Scanner key2 = new Scanner(System.in);
        System.out.print("Please enter hours worked: ");
        hours = key2.nextDouble();
        if (payrate<=25 && hours<=60){
            if (hours>35){
                overtimeh = hours - 35;
                overtimepr = payrate * 1.5;
                overtimetotal = overtimeh * overtimepr;
            }
            else {
                overtimetotal=0;
            }
           employpay = (payrate * hours) + overtimetotal;
            System.out.println("Employee Number: " + empnum);
            System.out.println("Pay rate: " + payrate);
            System.out.println("Hours worked: " + hours);
            System.out.println("Weekly pay: " + employpay);
        }

else    {
            System.out.println("Error payrate or hours worked entered has exceeded maximum limit! Please restart.");
        }

    }
}
