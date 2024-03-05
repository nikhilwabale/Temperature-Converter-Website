public class student
	public void studentdetails(int roll, string name, string address, int mark){
		System.out.println(roll+" "+name" "+address+" "+mark);
	}

	{
	public int getTotalmark(int x, int y, intz){
		int total=x+y+z;
		return total;

	}

	public static void main(String args[]){
		student std=new student();
		int output=std.getTotalmark(50,60,70);
		System.out.println(output);
		std.studentdetails(101,"Sagar","MatkiNagar",output);
	}
}