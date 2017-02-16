public class People
{
    String FirstName=" ";
	String LastName=" ";
	int SSN=0;
	int LotteryNumber=0;
	Vehicles v=null;
	
	
public People()
{
	FirstName="Hamza";
	LastName="khan";
	SSN=2121;
	LotteryNumber=2;
	
	
}


public People(String fn,String ln,int s,int lnu)
{
	FirstName=fn;
	LastName=ln;
	SSN=s;
	LotteryNumber=lnu;
}

public String getFirstName()
{
	return FirstName;
}
public String getLastName()
{
	return LastName;
}
public int getSSN()
{
	return SSN;
}
public int getLotteryNumber()
{
	return LotteryNumber;
}
public void setFirstname(String fn)
{
	FirstName=fn;
}
public void setLastName(String ln)
{
	LastName=ln;
}
public void setSSN(int s)
{
	SSN=s;
}
public void setLotteryNumber(int lnu)
{
	LotteryNumber=lnu;
}

public Vehicles getVehicles()
{
	return v;
}
public void setVehicles(Vehicles ve)

{
	v=ve;
}

public String toString()
{
	String out=" Firstname: " +FirstName+ "\n Lastname: " +LastName+ "\n SSN: " +SSN+ "\n Lottery Number: " +LotteryNumber;
	return out;
}
    
}