/**   
* @Title: ArrayListDemo.java 
* @Package cn.itcast.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��9��1�� ����3:47:55 
* @version V1.0   
*/
package cn.itcast.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName: ArrayListDemo
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��9��1�� ����3:47:55
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception {
		// �������϶���
		ArrayList<Integer> array = new ArrayList<Integer>();

		Class c = array.getClass();// ����ArrayList��class�ļ�����
		Method m = c.getMethod("add", Object.class);

		m.invoke(array, "hello");// ����array��add�����������ֵ��hello
		m.invoke(array, "world");
		m.invoke(array, "java");

		System.out.println(array);

	}

}
