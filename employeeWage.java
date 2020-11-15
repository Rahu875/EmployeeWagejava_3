public class employeeWage {
<<<<<<< HEAD

	public static void main(String[] args) {
		
System.out.println("Welcome to employeewage");
	}

=======
public static void main(String[] args) {
int IS_FULL_TIME =1;
double empCheck = Math.floor(Math.random() * 10) %2;
if (empCheck == IS_FULL_TIME)
	System.out.println("Employee is Present");
else
	System.out.println("Employee is Abscent");
}
>>>>>>> UC1-Employee_Attendence
}

public class employeeWage {
	
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static final int MAX_HOURS_IN_MONTH = 160;


	public static void main(String[] args) {

int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
while (totalEmpHrs <= MAX_HOURS_IN_MONTH && 
		totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
	int empWage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpWage += empWage;
	System.out.println(" Day#: " + totalWorkingDays + "Emp Hr: " + empHrs );
}
	System.out.println(" Total Emp Wage: " + totalEmpWage );
	}
}
