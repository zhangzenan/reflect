/**   
* @Title: ReflectDemo.java 
* @Package cn.itcast_03 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年8月28日 下午4:20:08 
* @version V1.0   
*/
package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月28日 下午4:20:08
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取所有的成员变量
		// Field[] fields=c.getFields();
		/*
		 * Field[] fields = c.getDeclaredFields(); for (Field field : fields) {
		 * System.out.println(field); }
		 */

		// 通过无参构造方法创建对象
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		// 获取单个的成员变量
		// 获取address并对其赋值
		Field addressField = c.getField("address");
		addressField.set(obj, "北京");
		System.out.println(obj);

		// 获取name并对其赋值
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "张三");
		System.out.println(obj);

		// 获取age并对其赋值
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 27);
		System.out.println(obj);

	}

}
