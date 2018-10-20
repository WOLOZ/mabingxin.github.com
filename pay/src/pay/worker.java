package pay;

import java.io.Serializable;

public class worker implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;//姓名
	public int month;//出生月份
	public int day;//出生日期
	public worker(String name,int month,int day){
		this.name = name;
		this.month = month;
		this.day = day;
	}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMonth(){
    	return month;
    }
    public void setMonth(int month){
    	this.month = month;
    }
    public int getDay(){
    	return day;
    }
    public void setDay(int day){
    	this.day = day;
    }

}

