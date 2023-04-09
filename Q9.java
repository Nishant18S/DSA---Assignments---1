import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		double arr[][]=new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			arr[i][j]=obj.nextDouble();

		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
		System.out.println("Sum of the elements in the minor diagonal is "+sumMinorDiagonal(arr));
        obj.close(); 
    }    
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum=0;
        for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
                if (i==j)
                    sum=sum+m[i][j];

        return sum ; 
    }
        public static double sumMinorDiagonal(double[][] m)
        {
            double sum=0;
            for (int i=0;i<4;i++)
    			for(int j=0;j<4;j++)
                    if (i==j)
                        sum=sum+m[i][j];

            return sum ; 

	}

}
