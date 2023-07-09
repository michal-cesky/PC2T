
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
			System.out.println(getName() + "Zápoèet byl udìlen");
		} else {
		System.out.println(getName() + "Zápoèet nebyl udìlen");
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
			System.out.println("Maximální hodnoceníe pøedmìtu je 100 bodù.");
			problem = true;
		}	
	}
}
