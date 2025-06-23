import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        * 1. Develop a program that takes the weight (in kilograms) and height (in meters)
             as input and calculates the BMI, then prints it.
        * */
        System.out.println("Please enter your weight in Kilo Grams(KG): ");
        float weight = input.nextFloat();

        System.out.println("please enter your height in meters(m)");
        float height = input.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("Your BMI is: "+bmi);

        /*
        * 2. Write a program that takes the obtained marks and total marks as input and
             calculates the percentage, then prints it.
        * */

        System.out.println("Grade percentage calculator");
        System.out.println("please enter your obtained mark (number)");
        float obtainedMarks = input.nextFloat();

        System.out.println("Please enter the total marks (out of)");
        float total = input.nextFloat();

        float percentage = obtainedMarks/total;
        System.out.println("Percentage = "+percentage);
    }
}
