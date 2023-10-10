package oopsAbstarction;

public class Automation extends MultipleLanguage {


	@Override
	public void Selenium() {
		System.out.println("Selinium");
		
	}

	@Override
	public void java() {
		System.out.println("Java");
		
	}

	@Override
	void python() {
		System.out.println("Python");
		
	}
	public void ruby() {
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}

}
