public class Vehicles
{
	double price=0.0;
	String type=" ";
	String drive=" ";
	static int vehiclesID=0;
	int currentID=0;
	People p=null;
	double distance=0.0;
	double velocity=0.0;
	double time=0.0;
	double acceleration=0.0;
	
	
public Vehicles()
{
	price=1234;
	type="SportsCar";
	drive="FrontWheel";
	vehiclesID++;
	currentID=vehiclesID;
	
}
public Vehicles(double p,String t,String d)
{
	price=p;
	type=t;
	drive=d;
	vehiclesID++;
	currentID=vehiclesID;
}
public double getprice()
{
	return price;
}
public String gettype()
{
	return type;
}
public String getdrive()
{
	return drive;
}
public int getcurrentID()
{
	return currentID;
}
public int getvehiclesID()
{
	return vehiclesID;
}


public void setprice(double p)
{
	price=p;
}
public void settype(String t)
{
	type=t;
}
public void setdrive(String d)
{
	drive=d;
}
public void setcurrentID(int cid)
{
	currentID=cid;
}
public void setvehiclesID(int vid)
{
	vehiclesID=vid;
}
public String toString()
{
	String out=" Vehicle's price: " +price+ "\n Type: " +type+ "\n Drive: " +drive+ "\n CurrentID: " +currentID+ "\n Vehicles' ID: " +vehiclesID;
    return out;	
}
public People getPeople()
{
	return p;
}
public void setPeople(People pe)
{
	p=pe;
}
public double getDistance()
	{
		return distance;
	}
public double getVelocity()
	{
		return velocity;
	}
public double getAcceleration()
	{
		return acceleration;
	}
public double getTime()
{
		return time;
	}
public void setDistance(double s)
	{
		distance=s;
	}
public void setVelocity(double v)
	{
		velocity=v;
	}
public void setAcceleration(double a)
	{
		acceleration=a;
	}
public void setTime(double t)
	{
		time=t; 
	}
public void finalTime()
	{
		time=Math.sqrt(2*distance/acceleration);
	}
public void finalVelocity()
	{
		velocity=acceleration*time;
	}

}