import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		BPC1 bpc1 = new BPC1();
		BPC2 bpc2 = new BPC2();
		BPIS bpis = new BPIS();
		
		//BPC1
		
		System.out.println(bpc1.getName() + " Vložte  body za cvièení maximáonì 20:");
		do
		{	
			bpc1.setActivityPoints(getInt(input));
		} 
		while (bpc1.problem);
		
		System.out.println(bpc1.getName() + " Vložte body za zkoušku maximálnì 80:");
		do
		{	
			bpc1.setExamPoints(getInt(input));
		} 
		while (bpc1.problem);
		
		
		//BPC2 f
		
		System.out.println(bpc2.getName() + " Vložte body za projekt maximálnì 30:");
		do
		{
			bpc2.setProjectPoints(getInt(input));
		} 
		while (bpc2.problem);
		
		System.out.println(bpc2.getName() + " Vložte body za test maximálnì 20:");
		do
		{	
			bpc2.setTestPoints(getInt(input));
		}
		while (bpc2.problem);
		
		System.out.println(bpc2.getName() + " Vložte body za zkoušku maximálnì 50:");
		do
		{	
			bpc2.setExamPoints(getInt(input));
		}
		while (bpc2.problem);
		
		
		// PREDMET BPIS
		
		System.out.println(bpis.getName() + " Vložte body zízksné za semestr:");
		do
		{	
			bpis.setPoints(getInt(input));
		} 
		while (bpis.problem);
		
		bpc1.getEvaluation();
		bpc2.getEvaluation();
		bpis.getEvaluation();
		
		
		input.close();
	}
	
	private static int getInt(Scanner input) 
	{
		try
		{
		   input.hasNextInt();
		   int x = input.nextInt();
		   input.nextLine();
		   return x;
		   
		}catch(Exception e)
		{
			System.out.println("Zatat èíslo:");
			input.nextLine();
			return getInt(input);
		}
		
	}


}
