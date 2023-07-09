import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		BPC1 bpc1 = new BPC1();
		BPC2 bpc2 = new BPC2();
		BPIS bpis = new BPIS();
		
		//BPC1
		
		System.out.println(bpc1.getName() + " Vlo�te  body za cvi�en� maxim�on� 20:");
		do
		{	
			bpc1.setActivityPoints(getInt(input));
		} 
		while (bpc1.problem);
		
		System.out.println(bpc1.getName() + " Vlo�te body za zkou�ku maxim�ln� 80:");
		do
		{	
			bpc1.setExamPoints(getInt(input));
		} 
		while (bpc1.problem);
		
		
		//BPC2 f
		
		System.out.println(bpc2.getName() + " Vlo�te body za projekt maxim�ln� 30:");
		do
		{
			bpc2.setProjectPoints(getInt(input));
		} 
		while (bpc2.problem);
		
		System.out.println(bpc2.getName() + " Vlo�te body za test maxim�ln� 20:");
		do
		{	
			bpc2.setTestPoints(getInt(input));
		}
		while (bpc2.problem);
		
		System.out.println(bpc2.getName() + " Vlo�te body za zkou�ku maxim�ln� 50:");
		do
		{	
			bpc2.setExamPoints(getInt(input));
		}
		while (bpc2.problem);
		
		
		// PREDMET BPIS
		
		System.out.println(bpis.getName() + " Vlo�te body z�zksn� za semestr:");
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
			System.out.println("Zatat ��slo:");
			input.nextLine();
			return getInt(input);
		}
		
	}


}
