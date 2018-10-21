package Transportation;

import java.util.Scanner;

public abstract class traffic {
	public String stime;//出发时间
	public String etime;//到达时间
	public String pttime;//取票时间
    public String sctime;//安检时间
    public int wtime;//候车时间
    public Double speed;//速度
    public Double unitprice;//单价
    public abstract void CountTimePrice(String sp, String ep, Double dt);//计算消耗时间和价格
    public void print(String sp, String ep, Double dt){
		this.CountTimePrice(sp, ep, dt);
    }
    public traffic(String stime,String etime,String pttime,String sctime,int wtime,Double speed,Double unitprice){
    	this.stime = stime;
    	this.etime = etime;
    	this.pttime = pttime;
    	this.sctime = sctime;
    	this.wtime = wtime; 
    	this.speed = speed;
    	this.unitprice = unitprice;
    }
    public void setstime (String stime){
    	this.stime = stime;
    }
    public String getstime(){
    	return this.stime;
    }
    public void setetime (String etime){
    	this.etime = etime;
    }
    public String getetime(){
    	return this.etime;
    }
    public void setpttime (String pttime){
    	this.pttime = pttime;
    }
    public String getpttime(){
    	return this.pttime;
    }
    public void setsctime (String sctime){
    	this.sctime = sctime;
    }
    public String getsctime(){
    	return this.sctime;
    }
    public void setwtime (int wtime){
    	this.wtime = wtime;
    }
    public int getwtime(){
    	return this.wtime;
    }
    public void setspeed (Double speed){
    	this.speed = speed;
    }
    public Double getspeed(){
    	return this.speed;
    }
    public void setunitprice (Double unitprice){
    	this.unitprice = unitprice;
    }
    public Double getunitprice(){
    	return this.unitprice;
    }
    
}
