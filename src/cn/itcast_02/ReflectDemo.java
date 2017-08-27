package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月27日 下午5:56:17
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c=Class.forName("cn.itcast_01.Person");
		
		//获取构造方法
		//public Constructor[] getConstructors:获取所有公共构造方法
		//public Constructor[] getDeclaredConstructors:获取所有构造方法
//		Constructor[] cons=c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);			
//		}	
		
		//获取单个构造方法
		//参数表示的是：你要获取的构造方法的构造参数个数及数据类型的Class字节码文件对象
		Constructor con=c.getConstructor();//返回的是构造方法对象
		//使用此Constructor对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		Object obj=con.newInstance();
		System.out.println(obj);
		
		
	}

}
