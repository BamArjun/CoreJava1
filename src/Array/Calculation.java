package Array;

public class Calculation {
	public static void main(String[] args) {
	int mat1[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
	int mat2[][] = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
int mat3[][]= new int[3][3];
for(int i = 0;i<3;i++)
	{
		for (int j = 0; j < 3; j++) {
			mat3[i][j] = mat1[i][j] + mat2[i][j];
			System.out.print(mat3[i][j] + " ");
		}
		System.out.println();
	}
}
}