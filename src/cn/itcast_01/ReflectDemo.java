package cn.itcast_01; 
/** 
* @ClassName: ReflectDemo 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2017��8��27�� ����11:51:52 
*/
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ʽ1
		Person p=new Person();
		Class c=p.getClass();
		
		Person p2=new Person();
		Class c2=p2.getClass();
		
		System.out.println(p==p2);
		System.out.println(c==c2);
		
		//��ʽ2
		Class c3=Person.class;
		System.out.println(c==c3);
		
		//��ʽ3
		Class c4=Class.forName("cn.itcast_01.Person");
		System.out.println(c==c4);
	}

}
 