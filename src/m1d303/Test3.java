package m1d303;

/**
 * extends �ؼ�����ǰ implements�ؼ����ں�
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
//�ܲ�εľ��ǽӿ�
//�ӿ�ͨ����ȡ������Ϊ����
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