package information;
import java.util.Scanner;

public class student extends Information
{
	Scanner sc = new Scanner(System.in);
	Information inf = new Information(); 
	
	
	int n,i;
	
	void St_Information()
	{
		System.out.println("How many Student Information do you want to give :");
		n = sc.nextInt();
		String c = sc.nextLine();
		
		for(i = 0 ; i < n ; i++)
		{
			System.out.println("Enter Your Name :");
			inf.name[i] = sc.nextLine();
			System.out.println("Enter Your ID :");
			inf.id[i] = sc.nextLine();
			System.out.println("Enter Your Dept :");
			inf.dept[i] = sc.nextLine();
			System.out.println("Enter Your Semester :");
			semester[i] = sc.nextLine();
			System.out.println("Enter Your Mobile :");
			inf.mobile[i] = sc.nextLine();
			System.out.println("Enter Your CGPA :");
			cgpa[i] = sc.nextDouble();
			String d = sc.nextLine();
			System.out.println("Enter Your Gender :");
			inf.gender[i] = sc.nextLine();
			System.out.println("Enter Your Date of Birth :");
			date_of_birth[i] = sc.nextLine();
			System.out.println("Enter Your Address :");
			inf.address[i] = sc.nextLine();					
		}
	}
	
	void St_display()
	{
		for(i = 0 ; i < n ; i++)
		{
			System.out.println("\nYour Name is :" + inf.name[i]);
			System.out.println("Your ID is:" + inf.id[i]);
			System.out.println("Your Dept is:" + inf.dept[i]);
			System.out.println("Your Semester is:" + semester[i]);
			System.out.println("Your Mobile Num is:" + inf.mobile[i]);
			System.out.println("Your CGPA is:" + cgpa[i]);
			System.out.println("Your Gender is:" + inf.gender[i]);
			System.out.println("Your Date of Birth is:" + date_of_birth[i]);
			System.out.println("Your Address is :" + inf.address[i] + "\n\n");					
		}
	}
	
	void St_display1()
	{
		for(i = 0 ; i < n ; i++)
		{
				System.out.println("student id:\n==========\n"+inf.id[i]);
				System.out.println("student Name:\n==========\n"+inf.name[i]);
				System.out.println("student dept:\n==========\n"+inf.dept[i]);
				System.out.println("student semester:\n==========\n"+inf.semester[i]);
				System.out.println("student mobile:\n==========\n"+inf.mobile[i]);
				System.out.println("student cgpa:\n==========\n"+inf.cgpa[i]);
				System.out.println("student Gender:\n==========\n"+inf.gender[i]);
				System.out.println("student date_of_birth:\n==========\n"+inf.date_of_birth[i]);
				System.out.println("student Address:\n==========\n"+inf.address[i]);
						
		
				//System.out.println(               inf.id[i] +"        "+ inf.name[i] +"        "+ inf.dept[i] +"        "+ semester[i] +"        "+ inf.mobile[i] +"        "+ cgpa[i] +"        "+ inf.gender[i] +"        "+ date_of_birth[i] +"        "+ inf.address[i] + "\n\n");
		}	
		
	}
	


}
