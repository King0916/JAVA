public class Switch{
	
	public static void main(String [] args){
		
		/*
		���̿���switch:
			�﷨:
			
				switch(���ʽ){
					
					case ֵ1 :
						����1 ;
						break ;
					case ֵ2 :
						����2;
						break ;
					.....
					case ֵN :
						����N ;
						break ;
					default :
						����;					
				}
			
			ע���:
				1�����ʽ����������ֻ����byte��short��int��char��String����
				2��case����ֵ������ ����ͱ��ʽ�����ͱ���ͳһ
				3��case�����ֵ �������ظ�
				4��case�������û��break,���û�У�����"case��͸"����
		*/
		
		int day = 7 ;
		
		switch(day){
			case 1 :
				System.out.println("��������һ");
				break;
			case 2 :
				System.out.println("�������ܶ�");
				break;
			case 3 :
				System.out.println("����������");
				break;
			case 4 :
				System.out.println("����������");
				break;
			case 5 :
				System.out.println("����������");
				break;
			case 6 :
				System.out.println("����������");
				break;
			case 7 :
				System.out.println("����������");
				break;
			default :
				System.out.println("�������ڰ�");
		}
		
		// String ���ַ�����
		// �ַ����� char ֻ��д�����ַ�
		
		String str = "��ʥ����";
		switch(str){
			case "��ʥ����" :
				System.out.println("��ʥ����");
				break;
			case "��ʥ����" :
				System.out.println("��ʥ����");
				break;
			case "��ʥ������" :
				System.out.println("��ʥ������");
				break;
			case "��ʥ������" :
				System.out.println("��ʥ������");
				break;
			case "��ʥ�㻹�ز��ص���" :
				System.out.println("��ʥ�㻹�ز��ص���");
				break;
			case "��ʥ�㻹�߲��ߵ���" :
				System.out.println("��ʥ�㻹�߲��ߵ���");
				break;
			case "��ʥ����" :
				System.out.println("��ʥ����");
				break;
				
			default :
				System.out.println("��ʥ���滵��");
		}
		
		/*
			��ϰ:
				����̨����һ���ɼ����ɼ����Դ�С����Ȼ���жϳɼ����ڵ�����
				[90-100] ����
				[80-90)	 ����
				[70-80)	 һ��
				[60-70)	 ����
				[0-60)	 ������
		*/
		
		
		
	}
	
}