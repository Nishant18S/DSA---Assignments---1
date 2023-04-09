import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of the Matrix:");
		int m=obj.nextInt();
		int n=obj.nextInt();
		int arr[][]=new int[m][n];
		int sum=0;
		System.out.print("Enter elements of Matrix:");
		for (int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			arr[i][j]=obj.nextInt();
		System.out.println("The elements of Matrix is: ");
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of elements of the Matrix is "+sum);

	}

}
