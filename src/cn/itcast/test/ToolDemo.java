/**   
* @Title: ToolDemo.java 
* @Package cn.itcast.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author A18ccms A18ccms_gmail_com   
* @date 2017��9��1�� ����4:19:15 
* @version V1.0   
*/
package cn.itcast.test;

/** 
* @ClassName: ToolDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��9��1�� ����4:19:15 
*  
*/
public class ToolDemo {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person p=new Person();
		
		Tool t=new Tool();
		t.setProperty(p, "name", "����");
		t.setProperty(p, "age", 27);
		System.out.println(p);
	}

}

class Person{
	private String name;
	public int age;
	
	
	@Override
	public String toString() {
		return name+"---"+age;
	}
	
}
