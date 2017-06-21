
public class MatrixNeighbors {

	private static int rows;
	private static int columns; 
	private static int[][] matrix;
	
	public MatrixNeighbors(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int[rows][columns];
	}
	
	public String neighbors(int row, int column)  {
		// Error Case
		if ((row >= rows) || (column >= columns)) {
			return "cell does not exist";
		}
		String str = "";
		// Top
		if (row-1 >= 0) {
			str = str + Integer.toString(row-1) + "," +  Integer.toString(column) + ";";
		}
		// Top Right
		if ((row-1 >= 0) && (column+1 < columns)) {
			str = str + Integer.toString(row-1) + "," +  Integer.toString(column+1) + ";";
		}
		// Right
		if (column+1 < columns) {
			str = str + Integer.toString(row) + "," +  Integer.toString(column+1) + ";";
		}
		// Bottom Right
		if ((row+1 < rows) && (column+1 < columns)) {
			str = str + Integer.toString(row+1) + "," +  Integer.toString(column+1) + ";";
		}
		// Bottom
		if (row+1 < rows) {
			str = str + Integer.toString(row+1) + "," +  Integer.toString(column) + ";";
		}
		// Bottom Left
		if ((row+1 < rows) && (column-1 >= 0)) {
			str = str + Integer.toString(row+1) + "," +  Integer.toString(column-1) + ";";
		}
		// Left
		if (column-1 >= 0) {
			str = str + Integer.toString(row) + "," +  Integer.toString(column-1) + ";";
		}
		// Top Left
		if ((row-1 >= 0) && (column-1 >=0)) {
			str = str + Integer.toString(row-1) + "," +  Integer.toString(column-1) + ";";
		}
		return str;
	}
	
	public static void main(String[] args) {
		MatrixNeighbors m = new MatrixNeighbors(3, 3);
		System.out.println(m.neighbors(0, 0)); //prints "0,1;1,1;1,0;"
		System.out.println(m.neighbors(2, 2)); //prints "1,2;2,1;1,1;"
		System.out.println(m.neighbors(1, 1)); //prints "0,1;0,2;1,2;2,2;2,1;2,0;1,0;0,0;"
		System.out.println(m.neighbors(3, 0)); //prints "cell does not exist"
	}

}
