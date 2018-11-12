package Matrix;

public class Matrix implements Runnable {
	static int[][] a = new int[1000][1000];
	static int[][] b = new int[1000][1000];
	static int[][] c = new int[a.length][b[0].length];// 接收上面两个矩阵的积的矩阵
	int index;// 矩阵的行下标
	static Thread t[] = new Thread[a.length];// 创建线程数组

	Matrix(int index) {
		this.index = index;// 当前线程矩阵的行下标
	}

	Matrix() {
	}

	@Override
	public void run() {
		try {
			if (a[0].length == b.length) {
				// a矩阵的列数等于b矩阵的行数才能进行矩阵的乘法
				this.matrix(index, a, b);
			} else {
				System.out.println("当前两个矩阵不能进行乘法运算");
			}
		} catch (Exception e) {
		}

	}

	public void matrix(int index, int[][] a, int[][] b) {
		// 取得传入的行下标所在行的矩阵的积
		try {
			for (int s = index; s < 1000; s = s + 8) {
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b.length; j++) {
						c[s][i] += a[s][j] * b[j][i];
					}

					// 此语句是为了打印每个线程的执行过程，想看的可以把注释符去掉
					// System.out.println(Thread.currentThread().getName()+"c["+index+"]["+i+"]:"+c[index][i]);
				}
			}
		} catch (Exception e) {
		}
	}

	public void print(int[][] a) {
		// 打印传入的矩阵
		System.out.println("***矩阵**");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Matrix d = new Matrix();// 创建当前类的对象，方便调用方法
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				b[i][j] = (int) (Math.random() * 10);
			}
		}
		// 输出三个矩阵有多少行和多少列
		System.out.println("a是" + a.length + "行" + a[0].length + "列");
		System.out.println("b是" + b.length + "行" + b[0].length + "列");
		System.out.println("c是" + c.length + "行" + c[0].length + "列");
		long startTime = System.nanoTime(); // 程序开始记录时间(毫秒)
		/*
		 * for (int i = 0; i <a.length; i++) { // 创建多线程 t[i] = new
		 * Thread(newMatrix(i)); // 创建线程 t[i].setName("线程" + i); // 设置线程的名字
		 * t[i].start(); 当前线程开始执行 }
		 */
		t[0] = new Thread(new Matrix(0));
		t[1] = new Thread(new Matrix(1));
		t[2] = new Thread(new Matrix(2));
		t[3] = new Thread(new Matrix(3));
		t[4] = new Thread(new Matrix(4));
		t[5] = new Thread(new Matrix(5));
		t[6] = new Thread(new Matrix(6));
		t[7] = new Thread(new Matrix(7));
//		t[8] = new Thread(new Matrix(8));
//		t[9] = new Thread(new Matrix(9));
//		t[10] = new Thread(new Matrix(10));
//		t[11] = new Thread(new Matrix(11));
//		t[12] = new Thread(new Matrix(12));
//		t[13] = new Thread(new Matrix(13));
//		t[14] = new Thread(new Matrix(14));
//		t[15] = new Thread(new Matrix(15));
//		t[16] = new Thread(new Matrix(16));
//		t[17] = new Thread(new Matrix(17));
//		t[18] = new Thread(new Matrix(18));
//		t[19] = new Thread(new Matrix(19));
//		t[20] = new Thread(new Matrix(20));
//		t[21] = new Thread(new Matrix(21));
//		t[22] = new Thread(new Matrix(22));
//		t[23] = new Thread(new Matrix(23));
//		t[24] = new Thread(new Matrix(24));
//		t[25] = new Thread(new Matrix(25));
//		t[26] = new Thread(new Matrix(26));
//		t[27] = new Thread(new Matrix(27));
//		t[28] = new Thread(new Matrix(28));
//		t[29] = new Thread(new Matrix(29));
//		t[30] = new Thread(new Matrix(30));
//		t[31] = new Thread(new Matrix(31));
		t[0].start();
		t[1].start();
		t[2].start();
		t[3].start();
		t[4].start();
		t[5].start();
		t[6].start();
		t[7].start();
//		t[8].start();
//		t[9].start();
//		t[10].start();
//		t[11].start();
//		t[12].start();
//		t[13].start();
//		t[14].start();
//		t[15].start();
//		t[16].start();
//		t[17].start();
//		t[18].start();
//		t[19].start();
//		t[20].start();
//		t[21].start();
//		t[22].start();
//		t[23].start();
//		t[24].start();
//		t[25].start();
//		t[26].start();
//		t[27].start();
//		t[28].start();
//		t[29].start();
//		t[30].start();
//		t[31].start();

		long endTime = System.nanoTime(); // 程序结束记录时间
		long TotalTime = endTime - startTime;// 总消耗时间
		System.out.println("消耗时间：" + TotalTime+"纳秒");
		//d.print(a);// 打印矩阵a
		//d.print(b);// 打印矩阵b
		//d.print(c);// 打印矩阵c
	}

}
