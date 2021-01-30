package m1d304;

/**
 * 接口在开发中的作用
 * 接口在开发中的作用类似于多态在开发中的作用
 * 多态：面向抽象编程，降低程序耦合度，提高扩展力
 * 
 * 接口是完全抽象的，面向抽象编程可以修改为面向接口编程。有了接口，就有了可插拔，表示扩展力强
 * 
 * customer has a Menu
 * 以后凡是能够使用hava a 来描述的，统一以属性的方式存在
 * cat is a Animal
 * 但凡满足is a 的表示都可以设置为继承
 * 
 * 任何一个接口都有调用者和实现者，可以将调用者和实现者解耦合。
 * 调用者面向接口调用
 * 实现者面向接口编写实现
 * 
 * 接口一般是对”行为“的抽象
 * 
 * 
 * 类型与类型之间的关系
 * is a： Cat is a Animal.
 * 凡是满足is a的表示“继承关系”  A extends B
 * 
 * has a：I have a book.
 * 凡是满足has a的表示“关联关系”，通常以“属性”方式存在  A{
 * 														 B b;
 * 													}
 * 
 * like a：Cooker like a foodmenu
 * 凡是满足like a的表示”实现关系“，实现关系通常是：类实现接口 A implements B
 * 
 * 
 * 抽象类与接口在语法上的区别：
 * 1.抽象类是半抽象的，接口是完全抽象的
 * 2.抽象类中有构造方法，接口中没有构造方法
 * 3.类之间支持单继承，接口之间支持多继承
 * 4.一个抽象类只能继承一个类，一个类可以同时实现多个接口
 * 5.接口中只有常量和抽象方法
 * @author hht_s
 *
 */

public class Test4 {
	public static void main(String[] args) {

		Menu co1=new cooker();
		//Menu co2=new cooker();
		customer c1=new customer(co1);
		c1.order();
		


	}
}
