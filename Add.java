import java.util.Scanner;
public class Add
{
    void sum (double r1,double r2)
    {
        System.out.println("Sum of 2 nos:"+(r1+r2));
    }
    void sum (int r3 ,int r4)
    {
        System.out.println("Sum of 2 nos:"+(r3+r4));
    }
    void sum(double r1,double r2,int r3)
    {
        System.out.println("Sum of 3 nos:"+(r1+r2+r3));
    }
    public static void main (String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st and 2nd no:");
        double r1 =s.nextDouble();
        double r2=s.nextDouble();
         System.out.println("Enter 3rd and 4th no:");
        int r3 =s.nextInt();
        int r4=s.nextInt();
        Add ob=new Add();
        ob.sum(r1,r2);
        ob.sum(r3,r4);
        ob.sum(r1,r2,r3);
    }
    }
