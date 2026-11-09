import java.util.Arrays;

public class WinterArrays {

	/*
	 * Given a 2D array, print it out row by row with a single space between each element.  
	 * Ex.  [["a", "b", "c"], ["d", "e", "f"]]  would be printed as:
	 *    a b c
	 *    d e f
	 * This method returns void and will be used to print your answers to the other problems.
	 * Once you get it working for an int[][], copy and paste it changing only the header to 
	 * make it work for Strings as well.  (That's called... overloading!)  
	 */
	public static void print2D(int[][] arr2D)
	{
		String print = "";
		for (int r = 0; r < arr2D.length; r++)
		{
			for (int c = 0; c < arr2D[r].length; c++)
			{
				print += arr2D[r][c] + " ";
			}
			print += "\n";
		}
		System.out.println(print);
	}
	
	public static void print2D(String[][] arr2D)
	{
		String print = "";
		for (int r = 0; r < arr2D.length; r++)
		{
			for (int c = 0; c < arr2D[r].length; c++)
			{
				print += arr2D[r][c] + " ";
			}
			print += "\n";
		}
		System.out.println(print);
	}
	
	
	
	/*
	 * Given a 2D array of ints, find the index position of the minimum element and return 
	 * a 2-cell array representing the index (i�j) of the row number and the column number. 
	 */
	public static int[] minTemperature(int[][] arr2D)
	{
		int[] pos = new int[2];
		int min = arr2D[0][0];
		pos[0] = 0;
		pos[1] = 0;
		for (int r = 0; r < arr2D.length; r++)
		{
			for (int c = 0; c < arr2D[r].length; c++)
			{
				if (min > arr2D[r][c])
				{
					min = arr2D[r][c];
					pos[0] = r;
					pos[1] = c;
				}
			}
		}
		return pos;
	}
	
	
	
	/*
	 * Given an odd number integer n, produce a two-dimensional array of size (n�n). Fill each element with 
	 * a single character string of "." . Then fill the middle row, the middle column and the diagonals with
	 * the single character string of "*" (an image of a snow flake). 
	 */
	public static String[][] snowflake(int n)
	{
		String[][] arr = new String[n][n];
		int mn = n / 2;
		for (int c = 0; c < n; c ++) //fill in all of the blank space
		{
			for(int r = 0; r < n; r++)
			{
				arr[c][r] = ".";
			}
		}
		for (int mr = 0; mr < n; mr++) //create the line that runs **horizontally** across the middle
		{
			arr[mn][mr] = "*";
		}
		for (int mc = 0; mc < n; mc++) //create the line that runs **vertically** across the middle
		{
			arr[mc][mn] = "*";
		}
		for (int line = 0; line < n ; line++) //create a one cross line
		{
			arr[line][line] = "*";
		}
		int crossR = 0;
		for (int crossC = n - 1; crossC >= 0; crossC--) //create the other cross line
		{
			arr[crossR][crossC] = "*";
			crossR++;
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int[][] coldDays = {{30, 35, 33, 45, 31}, {32, 33, 29, 28, 32}, {38, 39, 42, 45, 50}};
		print2D(coldDays);
		System.out.println(Arrays.toString(minTemperature(coldDays)));
		System.out.println("");
		print2D(snowflake(5));
		print2D(snowflake(9));
		
	}

}
