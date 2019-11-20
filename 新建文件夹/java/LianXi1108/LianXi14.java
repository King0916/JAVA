import java.util.Scanner;

public class LianXi14{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 :");
		
		int x = sc.nextInt();
		double y;//个人所得税
		double z;//实际收入
		double m=x-2000;
		if(m<=500){
			System.out.println(y=m*0.05);
			System.out.println(z=x-y);
		}else if(m<2000){
			System.out.println(y=(m-500)*0.1+500*0.05);
			System.out.println(z=x-y);
		}else if(m<5000){
			System.out.println(y=(m-2000)*0.15+1500*0.1+500*0.05);
			System.out.println(z=x-y);
		}else if(m<20000){
			System.out.println(y=(m-5000)*0.20+3000*0.15+1500*0.1+500*0.05);
			System.out.println(z=x-y);
		}else if(m<40000){
			System.out.println(y=(m-20000)*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05);
			System.out.println(z=x-y);
		}
	
	}
	
}