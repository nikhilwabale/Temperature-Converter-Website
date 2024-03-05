public class student1{
	public void studentdetails(int roll, String name, String address, int mark){
		System.out.println(roll+" "+name+" "+address+" "+mark);
	}

	public int getTotalmark(int x, int y, int z){
		int total=x+y+z;
		return total;

	}
	public void table(){
		for (int i=1; i<=10; i++){
			System.out.println(2* i);
		}
	}

	public static void main(String [] args){
		student std=new student();
		int output=std.getTotalmark(50,60,70);
		System.out.println(output);
		std.studentdetails(101,"Sagar","MatkiNagar",output);
		std.table(); 
	}
}