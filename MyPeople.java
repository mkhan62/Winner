import java.io.*;
import java.util.*;

public class MyPeople
{
	public static People[] sortPeople(String filename)
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
			System.out.print("error while reading the file");
		}
		
		
		int index=0;
		String str=" ";
		People[] participants=new People[count];
		
		try
		{
			Scanner scan=new Scanner(new File(filename));
			while(scan.hasNextLine())
			{
				str=scan.nextLine();
				StringTokenizer s=new StringTokenizer(str,"!");
				String first=s.nextToken();
				String last=s.nextToken();
				String ssn=s.nextToken();
				int ssn1=Integer.parseInt(ssn);
				String lotteryNumber=s.nextToken();
				int lotteryNumber1=Integer.parseInt(lotteryNumber);
				People p=new People(first, last, ssn1, lotteryNumber1);
				participants[index]=p;
				index++;
			}
		}
		catch(IOException ioe)
		{
			System.out.print("error when reading file");
		}
		return participants;
	}

}