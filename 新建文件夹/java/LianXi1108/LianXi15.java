import java.util.Scanner;

public class LianXi15{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÊı×Ö :");
		
		int x = sc.nextInt();
		int z;
		int bai=(int)x/100;
		//int shi=(int)((x-(bai*100))/10)x/10%10;
		int shi=x/10%10;
		//int ge=(x-(bai*100)-(shi*10));
		int ge=x%10;
			System.out.println(z=bai+shi+ge);
			
		}
	
	}
	
