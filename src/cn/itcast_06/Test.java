package cn.itcast_06;

import java.lang.reflect.Proxy;

/**
 * @ClassName: Test
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��9��2�� ����10:09:43
 */
public class Test {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.uodate();
		ud.find();
		System.out.println("-----------");

		// ����Ҫ����һ����̬�������
		// Proxy������һ���������Դ�����̬�������
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
