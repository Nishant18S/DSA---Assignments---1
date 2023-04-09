
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("The positive integer greater than 2 from command line argument is:");
       int n=Integer.parseInt(args[0]);
       int count=0;
       while(n>2)
       {
    	 n=n/2;
    	 count++;
       }
       System.out.println("The number of times one must repeatedly divide this number by 2 \r\n"
       		+ "before getting a value less than 2 is " +count);

	}

}
