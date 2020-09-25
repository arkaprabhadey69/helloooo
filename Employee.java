public class Employee7{
	static final int IS_FULL_TIME=2;
	static final int IS_PART_TIME=1;
	
	public String company;
	public int emprate;
	public int wrkingdays;
	public int wrkinghrs;
	public int totalwage;

	public Employee7(String company,int emprate,int wrkingdays, int wrkinghrs)
	{
		this.company=company;
		this.emprate=emprate;
		this.wrkingdays=wrkingdays;
		this.wrkinghrs=wrkinghrs;
	}

public void ComputeWage()
{
	int employeehrs=0;
	int totalworkdays=0;
	int totalemphrs=0;
	//int totalwage=0;
	
	while(totalemphrs<=wrkinghrs&&totalworkdays<wrkingdays)
{
	totalworkdays++;
	int empcheck=(int) Math.floor(Math.random()*10)%3;

	switch(empcheck)
	{
		case 1:
		employeehrs=4;
		break;
		case 2:
		employeehrs=8;
		break;
		default:
		employeehrs=0;
	}


	
	totalemphrs+=employeehrs;
	System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);


}
	totalwage=totalemphrs*emprate;


}
public String toString()
{
	return "Total emp wage for company: "+company+" is "+totalwage;
}

	
public static void main(String[] args) {
	
	
	Employee7 e= new Employee7("Xolo", 30, 5,100);
	e.ComputeWage();
	System.out.println(e);
}

}