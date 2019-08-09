import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		int row, col;
		
		// 1.��J�x�}�j�p
		Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J�x�}�j�p (X * Y)�G\nX =");
        row = scanner.nextInt();
        System.out.print("Y =");
        col = scanner.nextInt();
        
      
		int[][] a=new int[row][col];
		int[][] b=new int[col][row];
		
		// 2.��J�x�}���e
		System.out.println("--------------------------------");
		System.out.println("�п�JA�x�}��");
        for(int i=0;i<row;i++) 
        {
        	for(int j=0;j<col;j++) 
            {
	        	System.out.print("A["+ i +"]["+ j +"] =");
	            a[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("--------------------------------");
		System.out.println("�п�JB�x�}��");
        for(int i=0;i<col;i++) 
        {
        	for(int j=0;j<row;j++) 
            {
	        	System.out.print("B["+ i +"]["+ j +"] =");
	            b[i][j] = scanner.nextInt();
            }
        }
        
        
        // �L�XA
        System.out.println("--------------------------------");
        System.out.println("�x�}A");
		for(int i=0; i<a.length; i++)
		{
		   for(int j=0; j<a[i].length; j++)
		   {
			   System.out.print(a[i][j]+"\t");
		   }
		   System.out.println("");
		}
		
        // �L�XB
		System.out.println("--------------------------------");
		System.out.println("�x�}B");
		for(int i=0; i<b.length; i++)
		{
		   for(int j=0; j<b[i].length; j++)
		   {
			   System.out.print(b[i][j]+"\t");
		   }
		   System.out.println("");
		}
		
		// 3. �p��x�}���G
		int arow=a.length;
		int bcol=b[0].length;
		int m=b.length;
		int[][] c=new int[arow][bcol];
		
		System.out.println("--------------------------------");
		System.out.println("�x�}C");
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
