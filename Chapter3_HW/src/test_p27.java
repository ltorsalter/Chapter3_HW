
public class test_p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14th car1;
		car1 = new Car14th();
		car1.show();
		
		Car14th car2;
		car2 = new Car14th(1234,20.5);
		car2.show();
	}

}

class Car14th{
	private int num;
	private double gas;
	
	public Car14th() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car14th(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}