import java.util.Scanner;
class Empsalary
{
  int eid;
  double ta, da, hra, tax, basic, salary;
  String name;
void getdata()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter eid");
    eid=s.nextInt();
    System.out.println("enter name");
    name=s.next();
    System.out.println("enter salary details ta,da, hra,tax, basic");
    ta=s.nextDouble();
    da=s.nextDouble();
    hra=s.nextDouble();
    tax=s.nextDouble();
    basic=s.nextInt();
 }

  void cal()
  {
    salary=(basic+ta+da+hra)-tax;
  }  
void display()
{
    System.out.println("emp name="+name);
     System.out.println("emp id="+eid);
     System.out.println("emp salary="+salary);
    

}
public static void main(String args[])
{
    Empsalary e=new Empsalary();
  
    e.getdata();
    e.cal();
      System.out.println("employee details are");
      e.display();
}

}
