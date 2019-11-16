package static_block;
public class StaticBlock{
	{//initializer block-invoke when a constructor was called.
		System.out.println("Instance initializer block");
	}
	static {//static block-only invoke one times.Whenever First time visit this file.
		//even just use a static variable.
		String a = "a";//only used in this local block.
		System.out.println("static block");
	}
	static String i_love = "i_love";
	static String getLove() {
		return "get " + i_love;
	}
	public char b = 'b';
	
 	public StaticBlock() {
 		System.out.println("constructor");
 	}
 	public StaticBlock(int n) {
 		System.out.println("constructor " + n);
 	}
}

