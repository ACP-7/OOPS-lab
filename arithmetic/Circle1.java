package graphics;
import java.util.Scanner;
public class Circle1 implements Area_cal
{
double radius;
public void area()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Input Radius");
    radius=sc.nextDouble();
    System.out.println("Area of circle:"+(3.14 * radius * radius));

}
}
