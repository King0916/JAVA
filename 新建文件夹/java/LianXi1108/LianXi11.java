import java.util.Scanner;

public class LianXi11{
	
	public static void main(String [] args){
		
		
		/*
			������ǿ���̨����
			����̨����һ���ɼ����жϳɼ���������
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����� :");
		//С���������ֵ ��ֵ���� �Լ����������� 
		int year= sc.nextInt();
		
		if(year%400==0|(year%4==0&year%100!=0)){
			System.out.println("����");
		}else {
			System.out.println("ƽ��");
		}
	
	}
	
}