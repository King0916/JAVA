import java.util.Scanner;

public class LianXi16{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("一个数值:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y&y>z){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}else if(x>z&z>y){
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
		}else if(y>z&z>x){
			System.out.println(y);
			System.out.println(z);
			System.out.println(x);
		}else if(y>x&x>z){
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);
		}else if(z>y&y>x){
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
		}else if(z>x&x>y){
			System.out.println(z);
			System.out.println(x);
			System.out.println(y);
		}
	}
	
}