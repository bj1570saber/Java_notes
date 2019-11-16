package static_block;

public class drive {

	public static void main(String[] args) {
		//Invoke static block first then print static variable i_love.
		System.out.println(StaticBlock.i_love);
		System.out.println(StaticBlock.getLove());
		//Invoke initializer block first. Then invoke default constructor.
		StaticBlock i = new StaticBlock();
		System.out.println(i.b);
		System.out.println(StaticBlock.i_love);
		
		//Invoke initializer block first. Then invoke constructor.
		StaticBlock i_1 = new StaticBlock(1);
		//Invoke initializer block first. Then invoke constructor.
		StaticBlock i_2 = new StaticBlock(2);
		//Invoke initializer block first. Then invoke constructor.
		StaticBlock i_3 = new StaticBlock(3);
	}

}
