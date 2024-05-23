package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Temperature Converter ");
        System.out.println("1.Convert Fahrenheit to celsius ");
        System.out.println("2.Convert Celsius to fahrenheit ");

        int choice = userInput.nextInt();


        if (choice == 1) {
            System.out.println("Enter Temperature in celsius");
            double celsius = userInput.nextDouble();
            double fahrenheit = celsiustoFahrenheit(celsius);

            System.out.println( celsius +"Celsius is " + fahrenheit + "Fahrenheit"  );



        }
        if (choice == 2) {
            System.out.println("Enter Temperature in fahrenheit");
            double fahrenheit = userInput.nextDouble ();
            double celsius = fahrenheittoCelisus(fahrenheit);
            System.out.println( fahrenheit+"Fahrenheit is " + celsius +"Celsius " );
        }
    }



    public static double fahrenheittoCelisus(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 ;

    }

    public static double celsiustoFahrenheit(double celsius) {
        return (celsius * 9 /5 )+ 32;


    }
}

}
