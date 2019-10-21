import java.util.Scanner;
public class TempConverter{
public static void main(String [] args)
{
    float f, c;
    f = c = 0;
    int a;
    Scanner scan = new Scanner (System.in);
    System.out.println("Press 1 for C->F or 2 for F->C");
    a = scan.nextInt();
    if (a == 1) 
        convertCtoFAndPrint();
    else
        convertFtoCAndPrint();
}
public static void convertFtoCAndPrint()
{
    int c;
    int f = c = 0;
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter degrees F");
    f = (int) scan.nextFloat();
      System.out.println("enter degrees F"+f);
    c = (f-32) * 5/9;
    System.out.println(f + " degrees F is " + c + " degrees C.");
}
public static void convertCtoFAndPrint(){
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter degrees C");
    float c = scan.nextFloat();
    float f = (c*9/5)+32;
    System.out.println(c + " degrees C is " + f + " degrees F.");
}}
