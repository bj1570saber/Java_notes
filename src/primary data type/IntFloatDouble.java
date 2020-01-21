
public class IntFloatDouble {

	public static void main(String[] args) {
		int i = 5;
		float f = 5;
		double d = 5;
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println( (i+f) / 3 );
		System.out.println( (i+d) / 3 );
		System.out.println( (i+5.0) / 3 ); // 5.0 default to be double type
	}

}
