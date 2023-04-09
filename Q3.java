import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		int sum=0,product=1,p=n;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10; 
		}
		if(sum==product)
		{
			System.out.println(p + " is a spy number.");
		}
		else
			System.out.println(p + " is not a spy number.");
			

	}

}
