package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo3
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��27�� ����6:30:31
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast_01.Person");
		
		//��ȡ˽�й��췽������
		Constructor con=c.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);
		
		Object obj=con.newInstance("����");
		System.out.println(obj);

	}

}
