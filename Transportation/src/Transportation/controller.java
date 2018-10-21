package Transportation;
import java.util.Scanner;

public class controller {
	public static void main(String args[]){
		car car = new car("2018-09-22 21:00:00","2018-09-22 23:00:00","2018-09-22 20:30:00","2018-09-22 20:45:00",15,70.0,0.32);
		htrain htrain = new htrain("2018-09-22 21:00:00","2018-09-22 23:00:00","2018-09-22 20:30:00","2018-09-22 20:45:00",15,350.0,0.45);
		plane plane = new plane("2018-09-22 21:00:00","2018-09-22 23:00:00","2018-09-22 20:30:00","2018-09-22 20:45:00",15,900.0,0.75);
		System.out.println("请输入出发地，目的地和距离：");
		Scanner sc1 = new Scanner(System.in);
		String sp = sc1.next();
		Scanner sc2 = new Scanner(System.in);
		String ep = sc2.next();
		Scanner sc3 = new Scanner(System.in);
		Double dt = sc3.nextDouble();
		car.print(sp, ep, dt);
		htrain.print(sp, ep, dt);
		plane.print(sp, ep,dt);
	}
}
