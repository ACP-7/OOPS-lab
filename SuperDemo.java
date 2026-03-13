class SuperParent
{
    int roll_no;
    SuperParent(int rno)
    {
        roll_no=rno;
    }
}
class SuperChild extends SuperParent
{
    String name;
    SuperChild(int rno,String name)
    {
        super(rno);
        this.name=name;
    }
    void display()
    {
        System.out.println("Roll no:"+roll_no);
        System.out.println("Name:"+name);
    }
}
class SuperDemo
{
    public static void main (String args[])
    {
        SuperChild ob =new SuperChild(23,"Deepti");
        ob.display();
    }
}