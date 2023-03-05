package singleton;

public class Company {

	private static Company instance = new Company();   //private 으로 만들었기 때문에 다른 클래스에서 사용불가능함 그러므로 아래에 메소드를 하나 더 만듬.
	
	private Company() {}
	
	public static Company getInstance() {     //public 메소드를 만들어서 공용으로 사용할 수 있도록 함. 다른 클래스에서 공용으로 사용하도록 static을 붙임.
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
