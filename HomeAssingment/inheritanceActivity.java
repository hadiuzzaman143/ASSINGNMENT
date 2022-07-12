package SalaryCalculator;

public class inheritanceActivity 
{
	
	static Manager manager = new Manager();
	static Trainee trainee = new Trainee();
	
	public static void main(String[] args) 
	{
		
		testCase1(); //manager salary
		System.out.println("manager.calculateTransportAllowance()"); //manager transport allowance
		
		testCase2(); //trainee salary
		System.out.println("trainee.calculateTransportAllowance()"); //trainee transport allowance
		
	 

	}

	protected static void testCase1() 
	{
		
		manager.setEmployeeId(126534);
		manager.setEmployeeName("Peter");
		manager.setEmployeeAddress("Chennai India");
		manager.setEmployeePhone(237844);
		manager.setBasicSalary(65000);
		manager.calculateSalary();
		
	}

	protected static void testCase2() 
	{
		
		trainee.setEmployeeId(29846);
		trainee.setEmployeeName("Jack");
		trainee.setEmployeeAddress("Mumbai India");
		trainee.setEmployeePhone(442085);
		trainee.setBasicSalary(45000);
		trainee.calculateSalary();
		
	}
}
