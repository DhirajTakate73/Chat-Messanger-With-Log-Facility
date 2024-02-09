import java.io.*;
import java.net.*;

class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client of marvellous chat messanger is running...");

        Socket sobj = new Socket("Localhost",2100);//127.0.0.1
        System.out.println("Client is waiting for server to accept the request...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));        

        System.out.println("Marvellous chat messenger is started...");

        String str1, str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter the message for server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }
        System.out.println("Thank you for using marvellous chat messanger...");
        sobj.close();
        ps.close();
        br1.close();
        br2.close();
        
    }
}