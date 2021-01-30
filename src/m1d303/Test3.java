package m1d303;

/**
 * extends 关键字在前 implements关键字在后
 * @author hht_s
 *
 */
public class Test3 {
	public static void main(String[] args) {
		
		Flyable f1=new Cat();
		f1.fly();
		
		Flyable f2=new Pig();
		f2.fly();
		
		Flyable f3=new Fish();
		f3.fly();
	}
}

class Animal{
	
}
//能插拔的就是接口
//接口通常提取的是行为动作
interface Flyable{
	void fly();
}
class Cat extends Animal implements Flyable{
	public void fly() {
		System.out.println("feifeifei");
	}
}
class Snake extends Animal{
	
}
class Pig extends Animal implements Flyable{
	public void fly() {
		System.out.println("chichichi");
	}
}
class Fish implements Flyable{
	public void fly() {
		System.out.println("fish");
	}
}