class Manager
{
    
    int salary=30000;
}
class TeamLead extends Manager
{
String teamName="Team_A";
}
class Developer extends TeamLead
{
    int prjcId=666;
    void putdata()
    {
        System.out.println("Team name:"+teamName);
        System.out.println("Project Id:"+prjcId);
        System.out.println("Salary:"+salary);
    }
}
        class Projectmain
        {
            public static void main (String args[])
            {

            Developer d= new Developer();
            d.putdata();
        }


    }
