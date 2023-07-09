
public class BPC2 implements Predmet{

	private int ProjectPoints;
	private int TestPoints;
	private int ExamPoints;
	public boolean problem;
	
	@Override
	public String getName() 
	{
		return "BPC2 ";
	}

	@Override
	public int getPoints() 
	{
		return ProjectPoints + TestPoints + ExamPoints;
	}

	@Override
	public void getEvaluation() 
	{
		if (ProjectPoints + TestPoints >= SemestrPoints)
		{
			System.out.println(getName() + "Z�po�et byl ud�len s " + (ProjectPoints + TestPoints) +" body.");
			problem = false;
		}
		else
		{
			System.out.println(getName() + "Z�po�et nebyl ud�len. Z�zkan� body " + (ProjectPoints + TestPoints) + " z pot�ebn�ch 15.");
		problem = true;
		}
	}

	public void setProjectPoints(int points)
	{
		if (points <= 30)
		{
			ProjectPoints = points;
			problem = false;
		}
		else 
		{
			problem = true;
		}
	}
	
	public void setTestPoints(int points)
	{
		if (points <= 20)
		{
			TestPoints = points;
			problem = false;
		}
		else
		{
			problem = true;
		}
	}
	
	public void setExamPoints(int points)
	{
		if (points <= 50){
			ExamPoints = points;
			problem = false;
		}
		else
		{
			problem = true;
		}
	}
}
