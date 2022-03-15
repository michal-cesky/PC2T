
public class BPC1 implements Predmet {

	private int ActivityPoints;		//body za cvièení
	private int ExamPoints;			//body za zkoušku
	public boolean problem;			//pokud je zadán špatný rozsah
	
	@Override						//metoda pøekrývá rodièovskou metodu
	public String getName()			//metoda pro získání jeména 
	{		
		return "BPC1 ";
	}

	public void setActivityPoints(int points)		//funkce pro zadání bodù ze cvièení
	{
		if (ActivityPoints + points <= 20)
		{
			ActivityPoints += points;
			problem = false;
		}
		else 
		{
			problem = true;
		}	
	}
	
	@Override
	public void getEvaluation() 			//funkce pro ovìøení zápoètu
	{
		if (ActivityPoints >= SemestrPoints)
		{
			System.out.println(getName() + "Zápoèet byl udìlen s " + ActivityPoints +" body.");
			problem = false;
		}
		else 
		{	
		System.out.println(getName() + "Zápoèet nebyl udìlen. Zízkané body " + ActivityPoints + " z potøebných 15.");
		problem = true;
		}
	}
	
	public void setExamPoints(int points)		//funkce pro zadání bodù ze zkoušky
	{
		if (points <= 80)
		{
			ExamPoints = points;
			problem = false;
		}
		else
		{
			problem = true;
		}		
	}
	
	@Override
	public int getPoints() 			//metoda pro získání poètu bodù 
	{		
		return ActivityPoints + ExamPoints;
	}
}
