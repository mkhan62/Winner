public class Final
{
	public static void main(String[] args)
	{
		Vehicles[] prizes=MyVehicles.sortVehicles("awards.txt");
		People[] participants=MyPeople.sortPeople("participants.txt");

		for(int p=0; p<prizes.length;)
		{
			int lottery=(int)(1+Math.random()*(50));
			
			
			for(int i=0; i<participants.length;i++)
			{
				if(lottery==participants[i].getLotteryNumber() && participants[i].getVehicles()==null)
				{
					for(int a=0; a<participants.length; a++)
					{
						if(participants[i].getSSN()==participants[a].getSSN() && participants[a].getVehicles()!=null)
						{
							System.out.println(participants[i].getFirstName()+" "+participants[i].getLastName()+" has the same SSN as a winner and is a cheater");
							a=participants.length;//to stop looping of the same entry
							i=participants.length;
						}
						else if(participants[i].getSSN()==participants[a].getSSN() && participants[a].getVehicles()==null)
						{
							participants[i].setVehicles(prizes[p]);
							prizes[p].setPeople(participants[i]);
							p++;
							a=participants.length;
							i=participants.length;
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		System.out.println("Winners: ");
		for(int w=0; w<participants.length; w++)
		{
			if(participants[w].getVehicles()!=null)
			{
				System.out.println("Winner: "+participants[w].toString());
				System.out.println("Vehicle: "+participants[w].getVehicles().toString());
			}
		}
		
		System.out.println("\nLosers: ");
		for(int l=0; l<participants.length; l++)
		{
			if(participants[l].getVehicles()==null)
			{
				System.out.println(participants[l].getFirstName()+" "+participants[l].getLastName());
			}
		}
	
		
		
		
		
		
		
		double acceleration=0.0;
		for(int p=0; p<prizes.length; p++)
		{
			acceleration=(int)(1+Math.random()*(20));
			for(int b=0; b<prizes.length; b++)
			{
				if(prizes[b].getAcceleration()==acceleration)
				{
					acceleration=(int)(1+Math.random()*(20));
					b=-1;
				}
			}
			prizes[p].setAcceleration(acceleration);
			prizes[p].setDistance(50000.0);
			prizes[p].finalTime();
			prizes[p].finalVelocity();
		}
		
		
		
		double minimum=123456;
		int position=0;
		for(int i=0; i<prizes.length; i++)
		{
			if(prizes[i].getTime()<minimum)
			{
				minimum=prizes[i].getTime();
				position=i;
			}
		}
		
		System.out.println("\nWinner of the race is: "+prizes[position].getPeople().getFirstName()+" "+prizes[position].getPeople().getLastName());
		System.out.println("Acceleration: "+prizes[position].getAcceleration()+"\n CurrentID: "+prizes[position].getcurrentID()+"\n Time: "+prizes[position].getTime()+"\nFinal Velocity: "+prizes[position].getVelocity());


		
		
		minimum=123456;
		position=0;
		Vehicles[] prizes2=new Vehicles[prizes.length];
		for(int i=0; i<prizes2.length; i++)
		{
			for(int a=0; a<prizes.length; a++)
			{
				if(prizes[a].getTime()<minimum)
				{
					minimum=prizes[a].getTime();
					position=a;
				}
			}
			prizes2[i]=prizes[position];
			prizes[position].setTime(123456);
			minimum=123456;
		}
		System.out.println("\nThe order at the finish was:");
		for(int i=0; i<prizes2.length; i++)
		{
			System.out.println("Car ID: "+prizes2[i].getcurrentID()+"\n Acceleration: "+prizes2[i].getAcceleration());
		}

		}
}