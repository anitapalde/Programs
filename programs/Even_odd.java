package programs;

public class Even_odd {
public static void main(String[] args) {
	System.out.println("Even numbers");
	System.out.println("------------------");
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		System.out.println(i);
	}
	
	System.out.println("odd numbers");
	System.out.println("------------------");
	for(int i=1;i<=10;i=i+2)
	{
		System.out.println(i);
	}
	
}
}
