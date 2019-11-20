import java.util.Scanner;

public class LianXi17{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字 :");
		
		double x = sc.nextDouble();
		int y=  (int)x/10;
		switch(y){
			case 10 :
			case 9 :
				System.out.println("优秀");
				break;
			case 8 :
				System.out.println("良好");
				break;
			case 7 :
				System.out.println("一般");
				break;
			case 6 :
				System.out.println("及格");
				break;
			default :
				System.out.println("不及格");
		}
			
		}
	
	}
	
