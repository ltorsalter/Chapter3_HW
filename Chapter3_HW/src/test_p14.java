
public class test_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7th car1;
		car1=new Car7th();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}

class Car7th{
	int num;
	double gas;
	void setNum(int n) {
		num=n;
		System.out.println("�N�����]��"+num);
	}
	void setGas(double g) {
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
}