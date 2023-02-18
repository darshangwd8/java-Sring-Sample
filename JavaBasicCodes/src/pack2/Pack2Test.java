package pack2;

import pack1.Pack1Sample;

public class Pack2Test extends Pack1Sample{

	public static void main(String[] args) {
//		Pack1Sample obj = new Pack1Sample();
//		obj.method1();
//		For public method direct call----for protected extend must be used
		Pack2Test obj = new Pack2Test();
		obj.method2();// like this
	

	}

}
