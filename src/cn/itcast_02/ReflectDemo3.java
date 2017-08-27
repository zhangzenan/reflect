package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo3
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月27日 下午6:30:31
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取私有构造方法对象
		Constructor con=c.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);
		
		Object obj=con.newInstance("张三");
		System.out.println(obj);

	}

}
