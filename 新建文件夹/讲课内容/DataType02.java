public class DataType02{
	
	public static void main(String [] args){
		/*
		һ��������������   �������
			
		1���������� 			 ռ�ڴ��С			ȡֵ��Χ
			byte	�ֽ���       1�ֽ�8λ			-128  --- 127
			short	������		 2�ֽ�16λ
			int		����		 4�ֽ�32λ
			long	������       8�ֽ�64λ
			
			ע���:
				1��long���͵ı�������ֵ������Ҫ��L��l��
				2��
		2����������
			float   ������		 4�ֽ�32λ
			double  ˫����       8�ֽ�64λ
			
			ע���:
				1��float���͵ı�������ֵ������Ҫ��F(f)
				2��double���͵ı�������ֵ������Ҫ��D(d)
			
		3���ַ�����
			char				 2�ֽ�16λ
			
		4����������
			boolean	 �����ͱȽ����⣬ֵֻ����: true �� false
			
			
		*****
		��������
		�﷨:
			��������  ����  =  ֵ ;
			
			int  number = 10 ;
			
			long l = 100L  ;
			
			char c = 'a' ;
			
			boolean b = true ;
			
		*/
		
		long id = 10086L ;
		
		//System.out.println() ��ʾ����������
		//�����䣬С�����������˫���ţ�˫����֮��д����ʲô������ľ���ʲô
		//�����䣬С���������û��˫���ţ���Ĭ����һ��������������Ǳ�����ֵ
		System.out.println(id);   //10086
		System.out.println("id"); // id
		
		double �� = 3.14D ;
		
		float r = 10.0F;
		System.out.println(��);
		System.out.println(r);
		/*
			JS �� ����������
			Java��ǿ��������
				
				���������ԣ�����Ҫ����
				ǿ�������ԣ���Ҫ�ȱ��룬������
			
			1������
				javac �ļ���.java
					�����һ�� .class�ļ�    ���ļ���һ���ֽ����ļ�
			2������
				java �ļ���
		*/
		
	}
	
}