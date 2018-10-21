package Transportation;

public class plane extends traffic{
	public plane(String stime, String etime, String pttime, String sctime, int wtime, Double speed, Double unitprice) {
		super(stime, etime, pttime, sctime, wtime, speed, unitprice);
	}
	public void CountTimePrice(String sp, String ep, Double dt){
		Double time;
		Double price;
		time = dt / this.speed;
		price = dt * this.unitprice;
		System.out.println("从"+sp+"到"+ep+"飞机飞行"+dt+"公里   需耗时"+time+"小时   "+price+"元");
	}
	
}
