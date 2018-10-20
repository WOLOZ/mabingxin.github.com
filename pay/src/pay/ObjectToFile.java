package pay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ObjectToFile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void writeObject(){
		try {
			//创建存放员工信息的map
			Map<String,employee> em = new HashMap<String,employee>();
			em.put("0001",new employee("章",1,12,1202.9));
			//创建存放经理信息的map
			Map<String,manager> ma = new HashMap<String,manager>();
			ma.put("1001",new manager("吴",1,12,1202.9,2000.1));
			//创建存放股东信息的map
			Map<String,shareholder> sh = new HashMap<String,shareholder>();
			sh.put("2001",new shareholder("章",11,22,0.21,2222.1));
			System.out.println("请选择以下功能：");
			System.out.println("1：添加员工信息");
			System.out.println("2：添加经理信息");
			System.out.println("3：添加股东信息");
			System.out.println("4：修改员工工资");
			System.out.println("5：查看本月需要发放礼物的编号和姓名");
			System.out.println("6：查询工资，奖金，分红");
			System.out.println("7：修改股东红利");
			Scanner s1 = new Scanner(System.in);
			int se1 = s1.nextInt();
			if(se1 == 1){
				//录入员工信息
				System.out.println("请输入录入的员工人数：");
				Scanner sc1 = new Scanner(System.in);
				int nu = sc1.nextInt();
				System.out.println("请依次输入员工的编号，姓名，出生月，日，工资：");
			    for(int i = 0;i < nu; i++ ){
			    	Scanner sc2 = new Scanner(System.in);
				    String  eid= sc2.next();
				    Scanner sc3 = new Scanner(System.in);
				    String  ena= sc3.next();
				    Scanner sc4 = new Scanner(System.in);
				    int  emo= sc4.nextInt();  
				    Scanner sc5 = new Scanner(System.in);
				    int  eda= sc5.nextInt();
				    Scanner sc6 = new Scanner(System.in);
				    double  esa= sc6.nextDouble();                                    
				    em.put(eid,new employee(ena,emo,eda,esa));
			    }
			}else if(se1 == 2){
				//录入经理信息
				System.out.println("请输入录入的经理人数：");
				Scanner sca1 = new Scanner(System.in);
				int num = sca1.nextInt();
				System.out.println("请依次输入员工的编号，姓名，出生月，日，工资，奖金：");
			    for(int i = 0;i < num; i++ ){
			    	Scanner sca2 = new Scanner(System.in);
				    String  mid= sca2.next();
				    Scanner sca3 = new Scanner(System.in);
				    String  mna= sca3.next();
				    Scanner sca4 = new Scanner(System.in);
				    int  mmo= sca4.nextInt();
				    Scanner sca5 = new Scanner(System.in);
				    int  mda= sca5.nextInt();
				    Scanner sca6 = new Scanner(System.in);
				    double  msa= sca6.nextDouble();
				    Scanner sca7 = new Scanner(System.in);
				    double  mbo= sca7.nextDouble();
				    ma.put(mid,new manager(mna,mmo,mda,msa,mbo));
			    }
				
			}else if(se1 == 3){
				//录入股东信息
				System.out.println("请输入录入的股东人数：");
				Scanner scan1 = new Scanner(System.in);
				int snu = scan1.nextInt();
				System.out.println("请依次输入股东的编号，姓名，出生月，日，股份，分红：");
			    for(int i = 0;i < snu; i++ ){
			    	Scanner scan2 = new Scanner(System.in);
				    String  sid= scan2.next();
				    Scanner scan3 = new Scanner(System.in);
				    String  sna= scan3.next();
				    Scanner scan4 = new Scanner(System.in);
				    int  smo= scan4.nextInt();
				    Scanner scan5 = new Scanner(System.in);
				    int  sda= scan5.nextInt();
				    Scanner scan6 = new Scanner(System.in);
				    double  ssh= scan6.nextDouble();                                    
				    Scanner scan7 = new Scanner(System.in);
				    double  sdi= scan7.nextDouble();
				    sh.put(sid,new shareholder(sna,smo,sda,ssh,sdi));
			    }	
			}else if(se1 == 4){
				System.out.println("请输入修改工资的员工人数：");
				Scanner scann0 = new Scanner(System.in);
				int ins = scann0.nextInt();
				for(int i = 0;i < ins; i++ ){
					System.out.println("请输入需要修改的员工的编号：");
					Scanner scann1 = new Scanner(System.in);
				    String  id= scann1.next();
				    System.out.println("该员工姓名为："+em.get(id).getName()+" 工资为:"+em.get(id).getSalary());
				    System.out.println("请输入修改工资为:");
				    Scanner scann2 = new Scanner(System.in);
				    double  exsa= scann2.nextDouble(); 
				    em.get(id).setSalary(exsa);
				}
			}else if(se1 == 5){
				System.out.println("请输入本月月份：");
				Scanner scann3 = new Scanner(System.in);
			    int  mo= scann3.nextInt();
			    int f = 0;
			    for (Map.Entry<String, employee> entry : em.entrySet()) { 
					   if(entry.getValue().getMonth() == mo){
						   System.out.println("员工:编号：" + entry.getKey() + " 姓名：" + entry.getValue().getName());
						   f++;
					   } 
				   }
				   for (Map.Entry<String, manager> entry : ma.entrySet()) {
					   if(entry.getValue().getMonth() == mo){
						   System.out.println("经理:编号：" + entry.getKey() + " 姓名：" + entry.getValue().getName());
						   f++;
					   } 
				   }
				   if(f == 0){
					   System.out.println("本月无职员过生");
				   }
			    
			}else if(se1 == 6){
				System.out.println("请输入需查询人的类别：（1：员工2：经理3：股东）");
				Scanner scann4 = new Scanner(System.in);
			    int  cla= scann4.nextInt();
			    if(cla == 1){
			    	System.out.println("请输入查询员工人数：");
					Scanner scann5 = new Scanner(System.in);
					int senu = scann5.nextInt();
					 for(int i = 0;i < senu; i++ ){
						 System.out.println("请输入查询的员工的编号：");
					    	Scanner scann6 = new Scanner(System.in);
						    String  ineid= scann6.next();
						    System.out.println("该员工姓名为："+em.get(ineid).getName()+" 工资为:"+em.get(ineid).getSalary());
					 }
			    }else if(cla == 2){
			    	System.out.println("请输入查询经理人数：");
					Scanner scann7 = new Scanner(System.in);
					int smnu = scann7.nextInt();
					 for(int i = 0;i < smnu; i++ ){
						 System.out.println("请输入查询的经理的编号：");
					    	Scanner scann8 = new Scanner(System.in);
						    String  inmid= scann8.next();
						    System.out.println("该经理姓名为："+ma.get(inmid).getName()+" 工资为:"+ma.get(inmid).getSalary()+" 奖金为："+ ma.get(inmid).getBonus());
					 }
			    	
			    }else if(cla == 3){
			    	System.out.println("请输入查询股东人数：");
					Scanner scann9 = new Scanner(System.in);
					int ssnu = scann9.nextInt();
					 for(int i = 0;i < ssnu; i++ ){
						 System.out.println("请输入查询的股东的编号：");
					    	Scanner scanner = new Scanner(System.in);
						    String  insid= scanner.next();
						    System.out.println("该股东姓名为："+sh.get(insid).getName()+" 股份为:"+sh.get(insid).getShare()+" 红利为："+ sh.get(insid).getDividents());
					 }
			    		
			    }
				
			}else if(se1 == 7){
				System.out.println("请输入公司年盈利：");
				Scanner scanner2 = new Scanner(System.in);
				Double money1= scanner2.nextDouble();
				Double esalary = 0.0;
				Double msalary = 0.0;
				Double mbonus = 0.0;
				Double money2 = 0.0;
				Double sdividents = 0.0;
				for (Map.Entry<String, employee> entry : em.entrySet()) {
					   esalary = esalary + entry.getValue().getSalary();
					}
				for (Map.Entry<String, manager> entry : ma.entrySet()) {
					   msalary = msalary + entry.getValue().getSalary();
					   mbonus = mbonus + entry.getValue().getBonus();						  
					}
				money2 = money1 - esalary - msalary - mbonus;
				if(money2 < 0){
					   System.out.println("公司亏损，红利全部清零");
					   for (Map.Entry<String, shareholder> entry : sh.entrySet()){
						   entry.getValue().setDividents(0.0);
						}
				   }else{
					   for (Map.Entry<String, shareholder> entry : sh.entrySet()) {
						   sdividents = money2*entry.getValue().getShare();
						   entry.getValue().setDividents(sdividents);
							}
				}
				   
			}
		    FileOutputStream outStream = new FileOutputStream("D:/test.txt");
		    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);     
		    objectOutputStream.writeObject(em);
		    objectOutputStream.writeObject(ma);
		    objectOutputStream.writeObject(sh);
		    outStream.close();
		    System.out.println("successful");
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
		  @SuppressWarnings("unchecked")
		public void readObject(){
			  FileInputStream freader;

			  try {
			   freader = new FileInputStream("D:/test.txt");
			   @SuppressWarnings("resource")
			   ObjectInputStream objectInputStream = new ObjectInputStream(freader);
			   Map<String,employee> em = new HashMap<String,employee>();
			   Map<String,manager> ma = new HashMap<String,manager>();
			   Map<String,shareholder> sh = new HashMap<String,shareholder>();
			   em = (HashMap<String,employee>) objectInputStream.readObject();
			   ma = (HashMap<String,manager>) objectInputStream.readObject();
			   sh = (HashMap<String,shareholder>) objectInputStream.readObject();
			   System.out.println("职员信息:");
			   System.out.println("员工:");
			   for (Map.Entry<String, employee> entry : em.entrySet()) { 
					  System.out.println("编号：" + entry.getKey() + " 姓名：" + entry.getValue().getName()+" 出生月："+entry.getValue().getMonth()+" 出生日："+entry.getValue().getDay()+" 工资："+entry.getValue().getSalary()); 
					}
			   System.out.println("经理:");
			   for (Map.Entry<String, manager> entry : ma.entrySet()) { 
					  System.out.println("编号：" + entry.getKey() + " 姓名：" + entry.getValue().getName()+" 出生月："+entry.getValue().getMonth()+" 出生日："+entry.getValue().getDay()+" 工资："+entry.getValue().getSalary()+" 奖金："+entry.getValue().getBonus()); 
					}
			   System.out.println("股东:");
			   for (Map.Entry<String, shareholder> entry : sh.entrySet()) { 
					  System.out.println("编号：" + entry.getKey() + " 姓名：" + entry.getValue().getName()+" 出生月："+entry.getValue().getMonth()+" 出生日："+entry.getValue().getDay()+" 股份："+entry.getValue().getShare()+" 红利："+entry.getValue().getDividents()); 
					}

			  } catch (FileNotFoundException e) {

			   // TODO Auto-generated catch block

			   e.printStackTrace();

			  } catch (IOException e) {

			   // TODO Auto-generated catch block

			   e.printStackTrace();

			  } catch (ClassNotFoundException e) {

			   // TODO Auto-generated catch block

			   e.printStackTrace();

			  }
		  }
}
	

			  


