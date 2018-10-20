package pay;

import java.io.Serializable;

public class employee extends worker implements Serializable{
	//员工
	private static final long serialVersionUID = 1L;
	public double salary;//工资

	public employee(String name, int month, int day,double salary) {
		super(name, month, day);
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
    
}
