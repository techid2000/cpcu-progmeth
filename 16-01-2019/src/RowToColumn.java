
public class RowToColumn {
	public static int[][] rowToColumn(int[][] a) {
		int r = a.length, c = a[0].length;
		int ret[][] = new int[c][r];
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				ret[j][i] = a[i][j];
		return ret;
	}
}
