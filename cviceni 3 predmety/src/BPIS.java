
public class BPIS implements Predmet{
	private int points;
	public boolean problem;
	
	@Override
	public String getName() 
	{
		return "BPIS ";
	}

	@Override
	public int getPoints() 
	{
		return points;
	}

	@Override
	public void getEvaluation() 
	{
		if (points >= SemestrPoints)
		{
			System.out.println(getName() + "Z�po�et byl ud�len");
		} else {
		System.out.println(getName() + "Z�po�et nebyl ud�len");
		}
	}
	
	public void setPoints(int points) 
	{
		if (points <= 100)
		{
			this.points = points;
			problem = false;
		} else 
		{
			System.out.println("Maxim�ln� hodnocen�e p�edm�tu je 100 bod�.");
			problem = true;
		}	
	}
}
