import java.util.Scanner;
import java.io.PrintStream;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles to kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("9. Yards to Inches");
        System.out.println("10. Inches to Yards");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (5 / 9.0) * (fahrenheit-32);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (0.3048*feet);
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = (3.2808399*meters);
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double Ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Milliliters = (29.5735*Ounces);
            System.out.println(Ounces + " Ounces is " + Milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double Ounces = (0.033814*Milliliters);
            System.out.println(Milliliters + " milliliters is " + Ounces + " Ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Miles: ");
            double Miles = keyboard.nextDouble();
            keyboard.nextLine();
            double Kilometers = (1.60934*Miles);
            System.out.println(Miles + " miles is " + Kilometers + " Kilometers");
        }
        if (selection == 8)
        {
            System.out.println("Enter Kilometers: ");
            double Kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = (0.621371*Kilometers);
            System.out.println(Kilometers + " Kilometers is " + miles + " miles");
        }
        if (selection == 9)
        {
            System.out.println("Enter Yards: ");
            double Yards = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = (36*Yards);
            System.out.println(Yards + " Yards is " + inches + " inches");
        }
        if (selection == 10)
        {
            System.out.println("Enter Inches: ");
            double Inches = keyboard.nextDouble();
            keyboard.nextLine();
            double Yards = (0.0277778*Inches);
            System.out.println(Inches + " Inches is " + Yards + " Yards");
        }

    }
}