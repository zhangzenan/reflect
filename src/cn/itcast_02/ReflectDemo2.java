package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo2
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��27�� ����6:19:42
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast_01.Person");
		
		//��ȡ���ι��췽������
		Constructor con=c.getConstructor(String.class,int.class,String.class);
		
		//ͨ�����ι��췽�����󴴽�����
		Object obj=con.newInstance("����",20,"����");
		
		System.out.println(obj);

	}

}
