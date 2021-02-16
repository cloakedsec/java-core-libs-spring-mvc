package selenium.demo;

public class Two_Dim_Arrays {
	public static void main(String[] args) {
		String x[][] = new String[3][4];
	// first row
	x[0][0]= "A";
	x[0][1]= "B";
	x[0][2]= "C";
	x[0][3]= "D";
	// second row
	x[1][0]= "A1";
	x[1][1]= "B1";
	x[1][2]= "C1";
	x[1][3]= "D1";
	//third row
	x[2][0]= "A2";
	x[2][1]= "B2";
	x[2][2]= "C2";
	x[2][3]= "D2";
	//rows
	System.out.println("Rows are "+ x.length);
	//columns
	System.out.println("Columns are "+ x[0].length);
	
	int row = x.length;
	int cols = x[0].length;
	for(int rowNum = 0; rowNum < row; rowNum++)
	{
		for (int colNum = 0; colNum < cols; colNum++) {
			System.out.print(x[rowNum][colNum] + "===");
		}
		System.out.println();
	}
	
}
}
