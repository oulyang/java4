package m1d301;
/**
 * 接口
 * 1 接口也是一种引用数据类型
 * 2 接口是完全抽象的（抽象类是半抽象），或者说接口是特殊的抽象类
 * 		接口中只包含两部分：常量    抽象方法	
 * 
 * 3 语法结构
 * 		[修饰符列表] interface 接口名{}
 * 
 * 4 接口编译后生成class字节码文件
 * 
 * 5 接口支持多继承，一个接口能继承多个接口
 * 
 * 6 接口中所有的元素都是public修饰，在定义抽象方法时public abstract和public static final修饰符可以省略
 * 
 * 7 类和类之间叫继承 类和接口之间叫实现（可以看作继承）
 * 继承用extends关键字完成  实现用implements关键字完成
 * 
 * 【结论】当一个非抽象类实现接口的话，必须将接口中所有的抽象方法实现
 * @author hht_s
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

interface A{}

interface B{}

interface C extends B,A{}

interface MyMath{
	
	//public static final double PI=3.14159265;
	//public static final可以省略
	double PI=3.1415926;
	public abstract int sum(int x,int y);
	
	int sub(int x,int y);
	//接口抽象方法没有方法体
	//void dosome() {} 编译报错
}

