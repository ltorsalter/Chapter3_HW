
public class test_p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15th car1;
		car1=new Car15th();
		car1.show();
		Car15th car2;
		car2=new Car15th(1234,20.5);
		car2.show();
	}

}

class Car15th{
	private int num;
	private double gas;
	
	public Car15th() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car15th(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}