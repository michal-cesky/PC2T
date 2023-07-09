
public class BPC1 implements Predmet {

	private int ActivityPoints;		//body za cvi�en�
	private int ExamPoints;			//body za zkou�ku
	public boolean problem;			//pokud je zad�n �patn� rozsah
	
	@Override						//metoda p�ekr�v� rodi�ovskou metodu
	public String getName()			//metoda pro z�sk�n� jem�na 
	{		
		return "BPC1 ";
	}

	public void setActivityPoints(int points)		//funkce pro zad�n� bod� ze cvi�en�
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
	public void getEvaluation() 			//funkce pro ov��en� z�po�tu
	{
		if (ActivityPoints >= SemestrPoints)
		{
			System.out.println(getName() + "Z�po�et byl ud�len s " + ActivityPoints +" body.");
			problem = false;
		}
		else 
		{	
		System.out.println(getName() + "Z�po�et nebyl ud�len. Z�zkan� body " + ActivityPoints + " z pot�ebn�ch 15.");
		problem = true;
		}
	}
	
	public void setExamPoints(int points)		//funkce pro zad�n� bod� ze zkou�ky
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
	public int getPoints() 			//metoda pro z�sk�n� po�tu bod� 
	{		
		return ActivityPoints + ExamPoints;
	}
}
