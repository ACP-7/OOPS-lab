import java.util.Scanner;
class Multiplication extends Thread
{
    public void run()
    {
        System.out.println("Multiplication table of 5:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"x5="+i*5);
        }
        System.out.println("Exiting");

    }
}
class PrimeNumbers extends Thread
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        prime_N(n);
        sc.close();
    }
    static void prime_N(int N)
    {
        int x,y,flag;
        System.out.println("All the Prime nos within 1 and "+N+"are:");
        for(x=2;x<=N;x++)
        {
            flag=1;
            for(y=2;y<=x/2;++y)
            {
                if(x%y==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(x+"\t");
            }
        }
        System.out.println();

    }
}
public class ThreadClass {
public static void main(String[] args) {
    Multiplication a=new Multiplication();
    PrimeNumbers b=new PrimeNumbers();
    a.start();
    b.start();
}
    
}