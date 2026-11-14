package chapter1;

public class Task1_5
{
    public static void main(String args[])
    {
        System.out.println("Celsius to Fahrenheit:");

        double fahrenheit;

        for(int celsius = 0; celsius <= 100; celsius += 10)
        {
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Celsius: %d Fahrenheit: %.1f %n",celsius, fahrenheit);
        }
    }

}
