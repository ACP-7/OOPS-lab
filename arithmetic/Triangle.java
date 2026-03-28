package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal
{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input breadth and height:");
        b=sc.nextInt();
        h=sc.nextInt();
        System.out.println("Area:"+(0.5*b*h));
    }
}