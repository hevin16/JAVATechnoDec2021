package technocredits.exceptiondemo;

public class Example12 {

	void m1() {
		try {
			System.out.println(1);
			int x = 10;
			int y = 3;
			try {
				System.out.println("Hi");
				int ans = x/(y-3);
				System.out.println(ans);
			}catch(NullPointerException ne) {
				System.out.println("In inner catch");
			}
			System.out.println(2);
		}catch(StringIndexOutOfBoundsException ne) {
			System.out.println(3);
		}
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Example12().m1();
		System.out.println("end");
	}
}
