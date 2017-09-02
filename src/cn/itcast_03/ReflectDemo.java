/**   
* @Title: ReflectDemo.java 
* @Package cn.itcast_03 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��8��28�� ����4:20:08 
* @version V1.0   
*/
package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��8��28�� ����4:20:08
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast_01.Person");

		// ��ȡ���еĳ�Ա����
		// Field[] fields=c.getFields();
		/*
		 * Field[] fields = c.getDeclaredFields(); for (Field field : fields) {
		 * System.out.println(field); }
		 */

		// ͨ���޲ι��췽����������
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		// ��ȡ�����ĳ�Ա����
		// ��ȡaddress�����丳ֵ
		Field addressField = c.getField("address");
		addressField.set(obj, "����");
		System.out.println(obj);

		// ��ȡname�����丳ֵ
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "����");
		System.out.println(obj);

		// ��ȡage�����丳ֵ
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 27);
		System.out.println(obj);

	}

}
