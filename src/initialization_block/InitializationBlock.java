
public class InitializationBlock{
	public static void main(String[] args) {
		Employee[]staff = new Employee[3];
		
		staff[0]= new Employee("Harry", 4000);
		staff[1]= new Employee(6000);
		staff[2]= new Employee();
		
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() +",salary="+ e.getSalary());
	}
}

class Employee
{
	private static int nextId;
	
	private int id;
	private String name ="";
	private double salary;
	
	static// static initialization block
	{//invoke only one times. Whenever First time visit this file.
		//even just use a static variable, or call static function.
		String a = "a";//only used in this local block.
		System.out.println("static block");
		//Random generator = new Random();
		nextId = 0;
	}
	
	{//initializer block: Invoked when a constructor was called.
		id = nextId;
		nextId++;
		System.out.println("Instance initializer block, id: "+ id + ", nextId: " + nextId);
	}
	
	public Employee(String n, double s) 
	{
		System.out.println("1st.");
		name = n;
		salary = s;
	}
	
	public Employee(double s) 
	{
		this("Employee #" + nextId, s);
		System.out.println("2nd done.");
	}
	
	public Employee() 
	{
		System.out.println("3rd");
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
}
