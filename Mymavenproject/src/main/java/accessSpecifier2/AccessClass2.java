package accessSpecifier2;

import accessSpecifier.AccessClass;

public class AccessClass2 extends AccessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessClass2 obj=new AccessClass2();
		obj.protectedMethod();
		obj.publicMethod();
		
		//obj.privateMethod();  outside the package private and default not support only support protected and public
		//obj.defaultMethod();
		
		
	}

}
