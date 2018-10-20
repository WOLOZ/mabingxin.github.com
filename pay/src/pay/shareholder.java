package pay;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shareholder extends worker implements Serializable{
	//股东
	private static final long serialVersionUID = 1L;
	public double dividents;//红利
	public double share;//股份

	public shareholder(String name, int month, int day,double share,double dividents) {
		super(name, month, day);
		this.share = share;
		this.dividents = dividents;
		
  }
	public double getDividents(){
		return dividents;
	}
	public void setDividents(double dividents){
		this.dividents = dividents;
	}
	public double getShare(){
		return share;
	}
	public void setShare(double share){
		this.share = share;
	}
	//主函数
	 public static void main(String args[]){
		 ObjectToFile of = new ObjectToFile();
		 of.writeObject();
		 System.out.println("是否查看修改后的表：（1：是0：否）");
		 Scanner s = new Scanner(System.in);
		 int ch = s.nextInt();
		 if(ch == 1){
			 of.readObject(); 
		 }

	 }	 
     }
