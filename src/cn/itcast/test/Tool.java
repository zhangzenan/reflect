/**   
* @Title: Tool.java 
* @Package cn.itcast.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��9��1�� ����4:10:56 
* @version V1.0   
*/
package cn.itcast.test;

import java.lang.reflect.Field;

/** 
* @ClassName: Tool 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��9��1�� ����4:10:56 
*  
*/
public class Tool {
	
	public void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//���ݶ����ȡ�ֽ����ļ�����
		Class c=obj.getClass();
		//��ȡ�ö����propertyName��Ա����
		Field field=c.getDeclaredField(propertyName);
		//ȡ�����ʼ��
		field.setAccessible(true);
		//������ĳ�Ա������ֵΪָ����ֵ
		field.set(obj, value);
		
	}

}
