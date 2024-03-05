public class evenandodd{
	
	public void table(){
		for(int i=2;i<=50;i++){
 			if(i%2==0){
				System.out.println(i+":"+ "num is even");
			}
			else{
				System.out.println(i+":"+ "num is odd");

			}

		}
		
	}

	public static void main(String [] args){
		evenandodd std=new evenandodd();
		std.table(); 
	}
}