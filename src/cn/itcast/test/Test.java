/**   
* @Title: Test.java 
* @Package cn.itcast.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��9��1�� ����3:20:14 
* @version V1.0   
*/
package cn.itcast.test;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/** 
* @ClassName: Test 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��9��1�� ����3:20:14 
*  
*/
public class Test {
	public static void main(String[] args) throws Exception {
		
		//���ؼ�ֵ������
		Properties prop=new Properties();
		FileReader fr=new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		//��ȡ����
		String className=prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		
		//����
		Class c=Class.forName(className);
		
		Constructor con=c.getConstructor();
		Object obj=con.newInstance();
		
		//���÷���
		Method m=c.getMethod(methodName);
		m.invoke(obj);
		
		
	}

}
