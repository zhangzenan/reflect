/**   
* @Title: ReflectDemo.java 
* @Package cn.itcast_04 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月30日 下午3:51:39 
* @version V1.0   
*/
package cn.itcast_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月30日 下午3:51:39
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		Constructor con = c.getConstructor();

		Object obj = con.newInstance();

		// public void show()
		Method m1 = c.getMethod("show");

		m1.invoke(obj);

		System.out.println("--------");

		// public void method(String s)
		Method m2 = c.getMethod("method", String.class);

		m2.invoke(obj, "hello");
		System.out.println("--------");

		// public String getString(String s, int i)
		Method m3 = c.getMethod("getString", String.class, int.class);
		Object objString = m3.invoke(obj, "hello", 100);
		System.out.println(objString);

		String s = (String) m3.invoke(obj, "hello", 100);
		System.out.println(s);
		System.out.println("--------");
		
		//private void function()
		Method m4=c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);

	}

}
