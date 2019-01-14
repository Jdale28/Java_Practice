class Demo {
	protected int val;
	double dval;
	boolean bval;
	char cval;
}

public class UseDemo {
	public static void main(String[] args) {
		Demo obj = new Demo();
//		obj.val = 19000;
		System.out.println("The value is " + obj.val);
		System.out.println("The value is " + obj.dval);
		System.out.println("The value is " + obj.bval);
		System.out.println("The value is " + obj.cval);
	}
}
