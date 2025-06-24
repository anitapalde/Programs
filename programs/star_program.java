package programs;
public class star_program {
public static void main(String[] args) {
	
	int star=1;
	//row

	for (int i=1;i<=5; i++) {
		//column
		for(int j=1;j<=star; j++)
		{
			System.out.print("*");
		}
		
			System.out.println();
			star++;
		}
	}
}

//*
//**
//***
//****
//*****