import java.util.Scanner;

public class LianXi8{
	
	public static void main(String [] args){
		
		
		/*
			������ǿ���̨����
			����̨����һ���ɼ����жϳɼ���������
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� :");
		//С���������ֵ ��ֵ���� �Լ����������� 
		int age = sc.nextInt();
		if(age<6){
			System.out.println("��ͯ");	
		}else if(age<=13){
			System.out.println("�ٶ�");
		}else if(age<=18){
			System.out.println("������");
		}else if(age<=35){
			System.out.println("����");
		}else if(age<=50){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		
		
	
	}
	
}