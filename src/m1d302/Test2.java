package m1d302;

/**
 * �ӿڿ��Զ�̳У�һ�������ͬʱʵ�ֶ���ӿڣ�������ʵ�����еĳ��󷽷�
 * ���ֻ����ֲ��ˡ�java��������֮��ֻ�ܵ��̳С���ȱ��
 * 
 * �ӿ���ӿ�֮���ڽ���ǿ������ת��ʱ��û�м̳й�ϵҲ����ǿת
 * ��������ʱ���ܳ���ClassCastException�쳣��
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
		
		
		
		//����ͨ���������п��ܳ��ִ���
		//��������ת�ͻ�������ת�ͣ���������֮�����Ҫ�м̳й�ϵ���������������
		//�������۲������ڽӿڷ���
		//���ջ��Ǻ�֮ǰһ������Ҫinstanceof����������ж�
		//����ת��֮ǰ��if+instanceof �ж�
		
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


