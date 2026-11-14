package chapter1;

public class Task1_4
{
    public static void main(String args[])
    {
        int inch;
        double meters;

        for(inch = 1; inch <= 144; inch++)
        {
            meters = inch * 0.0254;
            System.out.println(inch + " inches correspond " + meters + " meters");


            if(inch % 12 == 0)
            {
                System.out.println();
            }
        }
    }
}
