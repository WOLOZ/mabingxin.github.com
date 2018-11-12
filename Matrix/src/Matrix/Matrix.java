package Matrix;

public class Matrix {
	int row;	
	int col;	
	private int[][] array;		
	private Matrix(){
		//构造函数私有化，使用setArray方法进行初始化	
		}		
	public int[][] getArray() {
		return array;	
		} 	
	public void setArray(int[][] array) {
		//判断   二维数组是否为合法矩阵		
		int row = array.length;		
		int col = array[0].length;		
		for(int i = 1;i < row;i++){			
			if(col!=array[i].length){				
				System.out.println("输入的不是一个矩阵,请重新输入");				
				return;			
				}		
			}		
		this.row = row;		
		this.col = col;		
		this.array = array;	
		}		
	public String toString(){		
		if(array==null){			
			return "矩阵为空，请输入一个矩阵";		
			}		
		String s ="";		
		row = array.length;		
		col = array[row-1].length;				
		for(int i = 0;i < row;i++){			
			for(int j = 0;j < col;j++){				
				s+=array[i][j]+" ";			
				}			
			s+="\r\n";		
			}					
		return s;	
		}	
	public Matrix multip(Matrix x){		
		Matrix m = new Matrix();		
		m.setArray(multip(x.getArray()));		
		return m;			
		}	
	private int[][] multip(int[][] aim){		
		if(this.col!=aim.length){			
			System.out.println("两个矩阵不能相乘");			
			return null;		
			}		
		int[][] result = new int[this.row][aim[0].length];		
		for(int row = 0;row < this.row;row++){			
			for(int col = 0;col < aim[0].length;col++){				
				int num = 0;				
				for(int i = 0;i <this.col;i++){					
					num+=array[row][i]*aim[i][col];				
					}								
				result[row][col]=num;			
				}		
			}		
		return result;	
		}		
	public static void main(String[] args) {		
		Matrix m = new Matrix();		
		Matrix m2 = new Matrix();		
		int[][]rec = new int[1000][1000];
		for(int i = 0; i < 1000; i++){
			for(int j = 0;j < 1000; j++){
				rec[i][j] = (int)(Math.random()*10);	
			}
		}
		int[][]rec2 =new int[1000][1000];	
		for(int i = 0; i < 1000; i++){
			for(int j = 0;j < 1000; j++){
				rec2[i][j] = (int)(Math.random()*10);	
			}
		}
		long startTime = System.nanoTime(); //程序开始记录时间(纳秒)
		m.setArray(rec);		
		m2.setArray(rec2);
		//System.out.println(m);		
		//System.out.println(m2);		
		//System.out.println(m.multip(m2));
		m.multip(m2);
		long endTime   = System.nanoTime(); //程序结束记录时间
		long TotalTime = endTime - startTime;//总消耗时间
		System.out.println("消耗时间："+TotalTime+"纳秒");
		}	





}
