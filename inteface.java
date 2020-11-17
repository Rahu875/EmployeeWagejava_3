import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}

public class CompanyEmpWage {
	

public final String company;
public final int empRatePerHour;
public final int numOfWorkingDays;
public final int maxHoursPerMonth;
public int totalEmpWage;

public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
	this.company =company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingDays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
	totalEmpWage = 0;
}
public void setTotalEmpWage(int totalEmpWage) {
	this.totalEmpWage = totalEmpWage;
}
public String toString() {
	return "Total Emp Wage For Company:" +company+"is:"+totalEmpWage;
	}
