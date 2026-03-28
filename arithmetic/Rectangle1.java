package graphics;
import java.util.Scanner;
public class Rectangle1 implements Area_cal
{
    int l,b;
    public void area()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Length and Breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area:"+(l*b));
    }
}
