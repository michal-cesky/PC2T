
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
			System.out.println(getName() + "Zápoèet byl udìlen s " + (ProjectPoints + TestPoints) +" body.");
			problem = false;
		}
		else
		{
			System.out.println(getName() + "Zápoèet nebyl udìlen. Zízkané body " + (ProjectPoints + TestPoints) + " z potøebných 15.");
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
