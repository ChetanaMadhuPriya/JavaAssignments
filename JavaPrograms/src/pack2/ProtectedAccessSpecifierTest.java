package pack2;

import pack1.ProtectedAccessSpecifier;

public class ProtectedAccessSpecifierTest {

	public static void main(String[] args) {
		ProtectedAccessSpecifier obj = new ProtectedAccessSpecifier ();  
		// not visible as protected should be in same package
//	       obj.display();  
	}

}
