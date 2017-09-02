/**   
* @Title: Test.java 
* @Package cn.itcast.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年9月1日 下午3:20:14 
* @version V1.0   
*/
package cn.itcast.test;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/** 
* @ClassName: Test 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年9月1日 下午3:20:14 
*  
*/
public class Test {
	public static void main(String[] args) throws Exception {
		
		//加载键值对数据
		Properties prop=new Properties();
		FileReader fr=new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		//获取数据
		String className=prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		
		//反射
		Class c=Class.forName(className);
		
		Constructor con=c.getConstructor();
		Object obj=con.newInstance();
		
		//调用方法
		Method m=c.getMethod(methodName);
		m.invoke(obj);
		
		
	}

}
