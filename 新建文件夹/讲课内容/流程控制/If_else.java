public class If_else{
	
	public static void main(String [] args){
		
		/*
			
			
			if-else�﷨:
			
				if(�������ͱ��ʽ){
					
					����A;
					
				} else {
					
					����B;
				}
				
			������:
				���С������Ľ��Ϊtrue,��ִ�д���A
				���С������Ľ��Ϊfasle,��ִ�д���B
			
			����������Ĵ��� �������κδ���
			
			
		*/
		
		int money = 6000 ;
		
		if(money>=5000){
			
			System.out.println("��ϲ��н�������ˣ�");
			
		}else{
			System.out.println("�����ˣ�����ְ��н�ˣ�");
		}
		
		// ����һ����λ������ݣ��ж��Ƿ�������
		//1���ܱ�400����
		//2���ܱ�4���������ܱ�100����
		
		int year = 2000 ;
		
		//�ж��Ƿ�������
		if( year%400==0 | ( year%4==0 & year%100!=0 ) ){
			System.out.println("������");
		}else{
			System.out.println("��ƽ��");
		}
		
		
		
		if(year%400==0 ){
			System.out.println("������");
		}else{
						
			if( year%4==0 & year%100!=0){
				System.out.println("������");
			}else{
				System.out.println("��ƽ��");
								
			}
			
		}
		
		
	}
	
}