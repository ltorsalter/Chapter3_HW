
public class test_p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5th car1;
		car1=new Car5th();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
		car1.show();
	}

}

class Car5th{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}