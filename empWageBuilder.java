public class empWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	


		public static int calcEmpWageForCompany(String company,int empRate, int numOfDays,int maxHrs)  {
	 
	int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
	while (totalEmpHrs <= maxHrs && 
			totalWorkingDays < numOfDays) {
		int empHrs = 0;
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs =4;
				break;
				default:
					empHrs = 0;
		}
		totalEmpHrs += empHrs;
		
		System.out.println(" Day#: " + totalWorkingDays + "Emp Hr: " + empHrs );
	}
	int empWage = totalEmpHrs * empRate;
	totalEmpWage += empWage;
	System.out.println(" Total Emp Wage for company: " +  company +       "is : " +  totalEmpWage );
		return totalEmpWage;
		}
		public static void main (String args[]) {
	calcEmpWageForCompany ("flipcart",20,2,10);
	calcEmpWageForCompany ("relance",10,20,5);
		
		}
		
}

