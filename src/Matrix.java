import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		int row, col;
		
		// 1.輸入矩陣大小
		Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入矩陣大小 (X * Y)：\nX =");
        row = scanner.nextInt();
        System.out.print("Y =");
        col = scanner.nextInt();
        
      
		int[][] a=new int[row][col];
		int[][] b=new int[col][row];
		
		// 2.輸入矩陣內容
		System.out.println("--------------------------------");
		System.out.println("請輸入A矩陣值");
        for(int i=0;i<row;i++) 
        {
        	for(int j=0;j<col;j++) 
            {
	        	System.out.print("A["+ i +"]["+ j +"] =");
	            a[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("--------------------------------");
		System.out.println("請輸入B矩陣值");
        for(int i=0;i<col;i++) 
        {
        	for(int j=0;j<row;j++) 
            {
	        	System.out.print("B["+ i +"]["+ j +"] =");
	            b[i][j] = scanner.nextInt();
            }
        }
        
        
        // 印出A
        System.out.println("--------------------------------");
        System.out.println("矩陣A");
		for(int i=0; i<a.length; i++)
		{
		   for(int j=0; j<a[i].length; j++)
		   {
			   System.out.print(a[i][j]+"\t");
		   }
		   System.out.println("");
		}
		
        // 印出B
		System.out.println("--------------------------------");
		System.out.println("矩陣B");
		for(int i=0; i<b.length; i++)
		{
		   for(int j=0; j<b[i].length; j++)
		   {
			   System.out.print(b[i][j]+"\t");
		   }
		   System.out.println("");
		}
		
		// 3. 計算矩陣結果
		int arow=a.length;
		int bcol=b[0].length;
		int m=b.length;
		int[][] c=new int[arow][bcol];
		
		System.out.println("--------------------------------");
		System.out.println("矩陣C");
		for(int i=0;i<arow;i++){
			for(int j=0;j<bcol;j++){
				int result=0;
				for(int k=0;k<m;k++){
					result+=a[i][k]*b[k][j];
				}
				c[i][j]=result;
			}
		}
		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
