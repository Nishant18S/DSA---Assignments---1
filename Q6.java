import java.util.Scanner;

public class Q6 {
	public static boolean isOdd(int n) 
	{
		int b=n&1;
		if(b==0)
			return false;
		else 
			return true; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=obj.nextInt();
		System.out.println(n+" is odd: "+isOdd(n)); 
		 
			
	
	
		

	}

}
