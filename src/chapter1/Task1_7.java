package chapter1;

public class Task1_7
{
    public static void main(String args[])
    {
      double price = 10;
      int count = 5;
      double discountedPrice;

      if((price * count) >= 100)
      {
            discountedPrice = ((price * count) * 90) / 100;
            System.out.println("Discount applied: " + discountedPrice);
      }
      else
      {
          discountedPrice = price * count;
          System.out.printf("Discount is not apllied: %.1f %n", discountedPrice);
      }
    }
}
