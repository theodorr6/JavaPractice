package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Invalid entry. Yours max hours must be 40!");
            hoursWorked = scanner.nextDouble();
        }
            scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Gorss pay: " + grossPay);
    }
}
