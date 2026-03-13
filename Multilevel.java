class Principal
{
    String name="Rocky";
}
class Teacher extends Principal
{
    int tId=56;
}
class Student extends Teacher
{
int rno=78;
void display()
{
    System.out.println("Principal name:"+name);
    System.out.println("Teacher_id:"+tId);
    System.out.println("Student_roll_no:"+rno);

}
}
class Multilevel
{
    public static void main(String args[])
    {
        Student ob=new Student();
        ob.display();
    }
}
