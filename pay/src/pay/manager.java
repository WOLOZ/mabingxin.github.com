package pay;

import java.io.Serializable;

public class manager extends employee implements Serializable{
	//经理
	private static final long serialVersionUID = 1L;
	public double bonus;//奖金

	public manager(String name, int month, int day, double salary,double bonus) {
		super(name, month, day, salary);
		this.bonus = bonus;

	}
	public double getBonus(){
		return bonus;  
	}
	public void setBonus(double bonus){
		this.bonus = bonus;
	}


	

}
