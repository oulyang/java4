package m1d301;
/**
 * �ӿ�
 * 1 �ӿ�Ҳ��һ��������������
 * 2 �ӿ�����ȫ����ģ��������ǰ���󣩣�����˵�ӿ�������ĳ�����
 * 		�ӿ���ֻ���������֣�����    ���󷽷�	
 * 
 * 3 �﷨�ṹ
 * 		[���η��б�] interface �ӿ���{}
 * 
 * 4 �ӿڱ��������class�ֽ����ļ�
 * 
 * 5 �ӿ�֧�ֶ�̳У�һ���ӿ��ܼ̳ж���ӿ�
 * 
 * 6 �ӿ������е�Ԫ�ض���public���Σ��ڶ�����󷽷�ʱpublic abstract��public static final���η�����ʡ��
 * 
 * 7 �����֮��м̳� ��ͽӿ�֮���ʵ�֣����Կ����̳У�
 * �̳���extends�ؼ������  ʵ����implements�ؼ������
 * 
 * �����ۡ���һ���ǳ�����ʵ�ֽӿڵĻ������뽫�ӿ������еĳ��󷽷�ʵ��
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
	//public static final����ʡ��
	double PI=3.1415926;
	public abstract int sum(int x,int y);
	
	int sub(int x,int y);
	//�ӿڳ��󷽷�û�з�����
	//void dosome() {} ���뱨��
}

