
public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8th car1;
		car1=new  Car8th();
		
		int number=1234;
		double gasoline=20.5;
		
		car1.setNumGas(number, gasoline);
	}

}

class Car8th{
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}