package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��27�� ����5:56:17
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class c=Class.forName("cn.itcast_01.Person");
		
		//��ȡ���췽��
		//public Constructor[] getConstructors:��ȡ���й������췽��
		//public Constructor[] getDeclaredConstructors:��ȡ���й��췽��
//		Constructor[] cons=c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);			
//		}	
		
		//��ȡ�������췽��
		//������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�Class�ֽ����ļ�����
		Constructor con=c.getConstructor();//���ص��ǹ��췽������
		//ʹ�ô�Constructor�����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		Object obj=con.newInstance();
		System.out.println(obj);
		
		
	}

}
