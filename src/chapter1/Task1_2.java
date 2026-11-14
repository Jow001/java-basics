package chapter1;

public class Task1_2
{
    public static void main(String args[])
    {
        double gallons;
        double liters;
        int counter ;

        counter = 0;

        for(gallons = 1; gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons correspond " + liters + " liters");

            counter++;

            if(counter == 10)
            {
                System.out.println();
                counter = 0;
            }
        }
    }
}
