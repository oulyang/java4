package m1d302;

/**
 * 接口可以多继承，一个类可以同时实现多个接口，但必须实现所有的抽象方法
 * 这种机制弥补了【java中类与类之间只能单继承】的缺陷
 * 
 * 接口与接口之间在进行强制类型转换时，没有继承关系也可以强转
 * 但在运行时可能出现ClassCastException异常。
 * @author hht_s
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new D();
		B b1=new D();
		C c1=new D();
		B b2=(B)a1;
		b2.m2();
		
		D d1=(D)a1;
		d1.m2();
		/*
		 * D d1=new D(); d1.m1(); d1.m2(); d1.m3();
		 */
		
		
		
		//编译通过，但运行可能出现错误
		//无论向上转型还是向下转型，两种类型之间必须要有继承关系，否则编译器报错。
		//上述结论不适用在接口方面
		//最终还是和之前一样，需要instanceof运算符进行判断
		//向下转型之前先if+instanceof 判断
		
		 M m= new E();
		 if(m instanceof K){
		 	 K k1=(K)m;
		  }
		 
		
	}

}



  interface M{
  
  } 
  interface K{
  
  } 
  class E implements M{
  
  }


