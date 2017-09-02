package cn.itcast_06;

import java.lang.reflect.Proxy;

/**
 * @ClassName: Test
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年9月2日 下午10:09:43
 */
public class Test {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.uodate();
		ud.find();
		System.out.println("-----------");

		// 我们要创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象
		// public static Object newProxyInstance(ClassLoader loader,
		// Class<?>[] interfaces,
		// InvocationHandler h)
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				handler);
		proxy.add();
		proxy.delete();
		proxy.uodate();
		proxy.find();

	}

}
