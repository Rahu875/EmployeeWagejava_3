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
}
public class EmpWageBuilder implements ComputeEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<CompanyEmpWage>();
		companyToEmpWageMap = new HashMap<>();
		
	}

	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	
	companyEmpWageList.add(companyEmpWage);
	companyToEmpWageMap.put(company, companyEmpWage);
}
	
