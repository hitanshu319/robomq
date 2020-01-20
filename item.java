import java.util.Scanner;

public abstract  class item {
	private int Idnum;
	private String title;
	private int CopyCount;
	

	public item() {
	  System.out.println("this is constructor of super class");

	}
public void GettingDetails() {
	Scanner sc=new Scanner(System.in);
	Idnum= sc.nextInt();
	title=sc.next();
	CopyCount=CopyCount+1;
	
	
}
public void DsiplayDetails(){
	System.out.println(Idnum);
	System.out.println(title);
	System.out.println(CopyCount);
}
public abstract void getters();
public abstract void setters();

public static void main(String[] args) {
	
}
}
