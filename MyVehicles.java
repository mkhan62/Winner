import java.io.*;
import java.util.*;

public class MyVehicles
{
	public static Vehicles[] sortVehicles(String filename)
	{
		int count=0;
		try
		{
			Scanner scan=new Scanner(new File(filename));
		
			while(scan.hasNextLine())
			{
				scan.nextLine();
				count++;
			}
		}
		catch(IOException ioe)
		{
			System.out.print("error when reading file");
		}

		
		
		int index=0;
		String str=" ";
		Vehicles[] prizes=new Vehicles[count];
		
		try
		{
			Scanner scan=new Scanner(new File(filename));
			while(scan.hasNextLine())
			{
				str=scan.nextLine();
				StringTokenizer t=new StringTokenizer(str,":");
				String price=t.nextToken();
				int price1=Integer.parseInt(price);
				String type=t.nextToken();
				String drive=t.nextToken();
				Vehicles v=new Vehicles(price1, type, drive);
				prizes[index]=v;
				index++;
			}
		}
		catch(IOException ioe)
		{
			System.out.print("error while reading the file");
		}
		return prizes;
	}
}