package cn.itcast_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: MyInvocationHandler
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2017��9��2�� ����9:58:45
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target;// Ŀ�����

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��У��");
		Object result = method.invoke(target, args);
		System.out.println("��־��¼");
		return result;//���ص��Ǵ������
	}

}
