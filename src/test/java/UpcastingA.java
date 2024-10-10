
public class UpcastingA extends Upcasting {

	public void method3() {
		System.out.println("Executing third method");
	}
	public void method4() {
		System.out.println("Executing fourth method");
	}
	 public void method1() {
		 
		 System.out.println("overriden method");
	 }
	public static void main(String[] args) {
      Upcasting obj=new UpcastingA();//upcasting
      obj.method1();
      obj.method2();
      
		
	}

}
