package cn.itcast_02;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ReflectDemo2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年8月27日 下午6:19:42
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取带参构造方法对象
		Constructor con=c.getConstructor(String.class,int.class,String.class);
		
		//通过带参构造方法对象创建对象
		Object obj=con.newInstance("张三",20,"北京");
		
		System.out.println(obj);

	}

}
