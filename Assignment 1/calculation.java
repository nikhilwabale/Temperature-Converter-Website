public class calculation{
	
	public void table(){
		int a1=0;
		int a2=1;
		int z=0;
		int limit=100;
		System.out.println(a1);
		System.out.println(a2);  
		for(int i=2;z<=1000;i++){
			z=a1+a2;
			System.out.println(z); 
			a1=a2;
			a2=z;
		}
		
	}

	public static void main(String [] args){
		calculation std=new calculation();
		std.table(); 
	}
}