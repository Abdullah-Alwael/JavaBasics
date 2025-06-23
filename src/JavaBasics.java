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
        * 4. Create a program that takes a string as input, calculates its length, and then
          reverses the string using the StringBuilder class, finally printing both the length and
          reversed string.
        * */
        StringBuilder builtString;

        System.out.println("String Builder");
        System.out.println("enter any string:");
        input.nextLine();
        builtString = new StringBuilder(input.nextLine());

        int stringLength = builtString.length();
        System.out.println("Length of string: "+stringLength);

        StringBuilder reversedString = new StringBuilder(builtString.reverse());
        System.out.println("reverse of string is: "+reversedString);

        /*
        * 5. Develop a program that takes a sentence as input and extracts a substring from
            it, then prints the extracted substring.
        * */
        System.out.println("substring calculator");
        System.out.println("enter an entire sentence:");
//        input.nextLine();
        String entireSentence = input.nextLine();

        int startofStringIndex = -1;
        do {
            System.out.println("enter the start of the substring (integer number >=0<"+entireSentence.length()+")");
            startofStringIndex = input.nextInt();
            if (startofStringIndex < 0 || startofStringIndex >=entireSentence.length()){
                System.out.println("Cant be, enter again");
            }
        } while (startofStringIndex < 0 || startofStringIndex >=entireSentence.length());

        int endofStringIndex = 1;
        do {
            System.out.println("enter the end of the substring (integer number >"+startofStringIndex+"<"+entireSentence.length()+")");
            endofStringIndex = input.nextInt();
            if (endofStringIndex <= startofStringIndex || endofStringIndex >=entireSentence.length()){
                System.out.println("Cant be, enter again");
            }
        } while (endofStringIndex <= startofStringIndex || endofStringIndex >=entireSentence.length());

        String subString = entireSentence.substring(startofStringIndex, endofStringIndex);
        System.out.println("Your Sub-string is: " +subString);

        /*
        * 6. Write a program that takes a sentence and a keyword as input, then check if
            the keyword is present in the sentence and prints the result.
        * */

        System.out.println("Is present test");
        System.out.println("Enter an entire sentence:");
        input.nextLine();
        entireSentence = input.nextLine();

        System.out.println("Enter a keyword to search for:");
        String keywordToLookFor = input.nextLine();

        System.out.println("is "+keywordToLookFor +" present?: " +entireSentence.contains(keywordToLookFor));

        /*
        * 7. Develop a program that takes a sentence and a word to replace as input, then
            replace all occurrences of the word with another word and prints the modified
            sentence.
        * */

        System.out.println("Enter an entier sentence again:");
        entireSentence = input.nextLine();

        System.out.println("enter a word to replace:");
        keywordToLookFor = input.nextLine();

        System.out.println("enter a replacement word (substitute)");
        String substituteWord = input.nextLine();

        System.out.println("result = "+entireSentence.replace(keywordToLookFor, substituteWord));

        /*
        * Write a program that takes two strings as input and check if they are equal,
            ignoring the case, then prints whether they are equal or not.
        * */

        System.out.println("String comparison");
        System.out.println("Enter first string");
        String firstString = input.nextLine();

        System.out.println("Enter the second string:");
        String secondString = input.next();

        if (firstString.equalsIgnoreCase(secondString)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
