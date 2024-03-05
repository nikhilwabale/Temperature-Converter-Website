abstract class bike{

	bike(){

		System.out.println("bike is faster");
	}

	abstract void run();

	public void changegear(){

		System.out.println("abstract bike change gear");

	}

}

public class honda extends bike{
	
	public static void main(String[] args){
		bike b= new honda();

	 	b.changegear();
		b.run();
		}
		public void run(){

			System.out.println("running bike of honda");
		
		
	}
}