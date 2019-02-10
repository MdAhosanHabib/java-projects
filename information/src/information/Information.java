package information;
import java.util.Scanner;

public class Information 
{
	public String name[] = new String[100];
	public String id[] = new String[100];
	public String dept[] = new String[100];
	public String mobile[] = new String[100];
	public String gender[] = new String[100];
	public String address[] = new String[100];
        public String[] semester = new String[100];
	public double[] cgpa = new double[100];
	public String[] date_of_birth = new String[100];
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		student st = new student();
		teacher tch = new teacher();
		System.out.println("Press 1 if you are a student\n Press 2 if you are a teacher");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1:
		{
			st.St_Information();
			//st.St_display();
			st.St_display1();
			break;
		}
		case 2:
		{
			tch.Tch_info();
			tch.Tch_display();
			break;
		}
		}
	}
   
	
}


