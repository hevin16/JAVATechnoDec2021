package jayashri;

public class A18_Case3 {
	public static void main(String[] args){
        A18_ClassA a1 = new A18_ClassB();
        System.out.println(a1.x);
        System.out.println(a1.y);
		 //System.out.println(a1.z); Compile time error bcz z is not in class A
      
       a1.m1();
       a1.m2();
       //a1.m3();//Compile time error bcz m3 is not in class A
  }
}
