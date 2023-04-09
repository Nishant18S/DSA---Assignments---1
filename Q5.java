import java.util.Scanner;

public class Q5 {
	public static int sum_Of_Digits(int n)
	{
		int sum=0;
		do
		{
			sum=0;
			while(n>0)
			{
				
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
				
			}
			n=sum;
		}while(sum>9);
		return sum; 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=obj.nextInt();
		System.out.println("Sum of digits of "+n+" until the number is a single digit is: "+sum_Of_Digits(n)); 
		

	}

}
