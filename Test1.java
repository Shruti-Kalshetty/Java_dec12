
public class Test1 {

	public void show() {
		System.out.println("Hello!");
	}
	public static void disp() {
		System.out.println("This is disp method");
	}
	public static void main(String[] args) {
		System.out.println("Hi All");
		Test1 t=new Test1();
		t.show();
		t.show();
		t.show();
		t.show();
		Test1.disp();
	}

}
