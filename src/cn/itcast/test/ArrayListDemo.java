/**   
* @Title: ArrayListDemo.java 
* @Package cn.itcast.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年9月1日 下午3:47:55 
* @version V1.0   
*/
package cn.itcast.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName: ArrayListDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年9月1日 下午3:47:55
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception {
		// 创建集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();

		Class c = array.getClass();// 集合ArrayList的class文件对象
		Method m = c.getMethod("add", Object.class);

		m.invoke(array, "hello");// 调用array的add方法，传入的值是hello
		m.invoke(array, "world");
		m.invoke(array, "java");

		System.out.println(array);

	}

}
