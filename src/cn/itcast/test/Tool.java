/**   
* @Title: Tool.java 
* @Package cn.itcast.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017年9月1日 下午4:10:56 
* @version V1.0   
*/
package cn.itcast.test;

import java.lang.reflect.Field;

/** 
* @ClassName: Tool 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017年9月1日 下午4:10:56 
*  
*/
public class Tool {
	
	public void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//根据对象获取字节码文件对象
		Class c=obj.getClass();
		//获取该对象的propertyName成员变量
		Field field=c.getDeclaredField(propertyName);
		//取消访问检查
		field.setAccessible(true);
		//给对象的成员变量赋值为指定的值
		field.set(obj, value);
		
	}

}
