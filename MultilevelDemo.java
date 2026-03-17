import java.util.Scanner;
class Person
{
    String pname,address,gender;
    int age;
    Person(String pname1,String address1,String gender1,int age1)
    {
        pname=pname1;
        address=address1;
        gender=gender1;
        age=age1;
    }
}
class Employee extends Person
{
    String emp_id,cp_name,qualification;
    float salary;
    Employee(String pname,String address,String gender,int age,String emp_id,String cp_name,String qualification,float salary)
    {
        super(pname,address,gender,age);
        this.emp_id=emp_id;
        this.cp_name=cp_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class Teacher extends Employee
{
    int teach_id;
    String department,subject;
    Teacher(int teach_id,String department,String subject,String emp_id,String qualification,float salary,String pname,String address,String gender,int age)
    {
        super
    }
}