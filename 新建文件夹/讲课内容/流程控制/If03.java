public class If03{
	
	public static void main(String [] args){
		
		/*
			����if-else if�﷨:
				
				if(�������ͱ��ʽ1){					
					����1;
					
				}else if(�������ͱ��ʽ2){
					����2;
					
				}else if(�������ͱ��ʽ3){
					����3;
				
				....
				}else if(�������ͱ��ʽN){
					����N;
					
				}else{
					
				}
				
		*/
		
		/*
			���ݳɼ��ж���������
			[90-100] ����
			[80-90)	 ����
			[70-80)	 һ��
			[60-70)	 ����
			[0-60)	 ������
		*/
		int score = -1 ;
		
		//�жϳɼ����ĸ�����
		if(score>=90){
			System.out.println("���㣡");
			
		}else if(score >=80 & score <90){
			System.out.println("���ã�");
			
		}else if(score >= 70 & score <80){
			System.out.println("һ�㣡");
			
		}else if(score >=60){
			System.out.println("����");
			
		}else {
			System.out.println("������");
		}
		
		
		int age1 = 503 ;
		int age2 = 503 ;
		int age = age1 - age2 ;
		
		if( age == 3 ){
			System.out.println("Ů��������ש");
			
		}else if (age == 30){
			System.out.println("Ů����ʮ�ͽ�ɽ");
			
		}else if (age == 300){
			System.out.println("Ů���������ɵ�");
			
		}else if (age == 3000){
			System.out.println("Ů����ǧλ���ɰ�");
			
		}
		
		
		
	}
	
}