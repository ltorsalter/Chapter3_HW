
public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car13th car1;
		car1 = new Car13th();
		
		car1.show();
	}

}

class Car13th{
	private int num;
	private double gas;
	
	public Car13th() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}