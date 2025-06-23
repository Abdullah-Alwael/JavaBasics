import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        * 1. Develop a program that takes the weight (in kilograms) and height (in meters)
             as input and calculates the BMI, then prints it.
        * */

        System.out.println("BMI Calculator");
        System.out.println("enter your weight in Kilo Grams(KG): ");
        float weight = input.nextFloat();

        System.out.println("enter your height in meters(m)");
        float height = input.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("Your BMI is: "+bmi);

        /*
        * 2. Write a program that takes the obtained marks and total marks as input and
             calculates the percentage, then prints it.
        * */

        System.out.println("Grade percentage calculator");
        System.out.println("enter your obtained mark (number)");
        float obtainedMarks = input.nextFloat();

        System.out.println("enter the total marks (out of)");
        float totalMarks = input.nextFloat();

        float percentage = obtainedMarks/totalMarks*100;
        System.out.println("Percentage = "+percentage+"%");

        /*
        *3. Create a program that takes an amount in one currency and an exchange rate
            as input, then converts and prints the amount in another currency.
        * */

        System.out.println("Exchange rate calculator:");
        System.out.println("Enter the amount in the original currency");
        double amountInOriginalCurrency = input.nextDouble();

        System.out.println("enter the exchange rate for the desired currency");
        double desiredCurrencyExchangeRate = input.nextDouble();

        System.out.println("Amount after rate exchange is:");

        double desiredAmount = amountInOriginalCurrency*desiredCurrencyExchangeRate;
        System.out.println(desiredAmount);

        /*
        *
        * */
    }
}
