class animal{

	public void eat(){
		System.out.println("Eating");
	}

}

class humanbeing{

	public void human(){
		System.out.println("Enjoying");
	}
  
}
class man extends animal,humanbeing{

	public void live(){
		System.out.println("Living");
	}

}
public class humans{
	public static void main(String[] args){
		man d=new man();
		d.eat();
		d.human();
		d.live();
	}
}