package manageInstance;

public class Singleton {
	public static Singleton instance;

	private Singleton() {
		super();
		System.out.println("Get New Instance");
	}
	public static Singleton getInstance() {
		if(instance == null)
		{
			instance = new Singleton();
		}else {
			System.out.println("Already exist");
		}
		return instance;
	}
	
	
	

}
