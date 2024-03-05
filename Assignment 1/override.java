class animal{

	void Sound(){
		System.out.println("Sound");
	}

}
class dog extends animal{

	void Sound(String abc, int y){
		System.out.println("Barking");
	}

}

public class override{
	public static void main(String[] args){
		dog D= new dog();
		D.Sound();
	}
}