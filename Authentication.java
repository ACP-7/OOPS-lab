import java.util.Scanner;
 class CredentialException extends Exception
{
    public CredentialException(String s)
    {
        super(s);
    }
}
public class Authentication
{
    public static void main (String args[])
    {
        String username="Ashish";
        String password="@Ashish123";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username and password:");
        String u1=sc.nextLine();
        String u2=sc.nextLine();
        try
        {
            if((u1.equals(username))&&(u2.equals(password)))
            {
                System.out.println("Access Granted");
            }
            else
            {
                throw new CredentialException("Invalid Credentials");
            }
        }
        catch (CredentialException e)
        {
            System.out.println(e.getMessage());
        }
    }
}