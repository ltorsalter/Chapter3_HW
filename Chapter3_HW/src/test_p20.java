
public class test_p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10th car1;
		car1=new Car10th();
		
		car1.num=1234;
		car1.gas=-10;
		
		car1.show();
	}

}

class Car10th{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}