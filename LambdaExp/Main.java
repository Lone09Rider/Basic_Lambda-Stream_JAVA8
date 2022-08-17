package LambdaExp;

interface namePart 
{
	String name(String name);
}

interface Yolo
{
	void hello();
}

class YoloClass implements Yolo 
{

	@Override
	public void hello() {
		System.out.println("Yolo From Class");
	}
	
}

public class Main {
	public static void main(String[] args) {
		Yolo y = new Yolo() {
			
			@Override
			public void hello() {
				System.out.println("Yolo from main");
			}
		};
		y.hello();
		
		Yolo y1 = new YoloClass();
		y1.hello();
		
		
		Yolo helloFromLambda = () -> {
			System.out.println("Yolo From Lambda");
		};
		
		helloFromLambda.hello();
		
		namePart n = (String name) -> {
			return "Hello "+ name;
		};
		
		System.out.println(n.name("KirA"));
	}
}
