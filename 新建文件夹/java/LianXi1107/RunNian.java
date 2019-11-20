public class RunNian{
	public static void main(String [] args){
		int year = 2019;
		int N = year%400==0|(year%4==0&year%100!=0) ? 1:2 ;
		System.out.println(N);
	}
	
}