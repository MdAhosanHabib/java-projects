package information;
import java.util.Scanner;

public class teacher extends Information
{
	Scanner sc = new Scanner(System.in);
	Information inf = new Information(); 
	
	public String[] designatiom = new String[100];
	
	int n,i;
	
	void Tch_Information()
	{
		System.out.println("How many Teacher Information do you want to give :");
		n = sc.nextInt();
		String c = sc.nextLine();
		
		for(i = 0 ; i < n ; i++)
		{
			System.out.println("Enter Your Name :");
			inf.name[i] = sc.nextLine();
			System.out.println("Enter Your ID :");
			inf.id[i] = sc.nextLine();
			System.out.println("Enter Your Designation :");
			designatiom[i] = sc.nextLine();
			System.out.println("Enter Your Department :");
			inf.dept[i] = sc.nextLine();
			System.out.println("Enter Your Mobile :");
			inf.mobile[i] = sc.nextLine();
			System.out.println("Enter Your Gender :");
			inf.gender[i] = sc.nextLine();
			System.out.println("Enter Your Address :");
			inf.address[i] = sc.nextLine();					
		}
	}
	
	void Tch_display()
	{
		for(i = 0 ; i < n ; i++)
		{
			System.out.println("Your Name is :" + inf.name[i]);
			System.out.println("Your ID is:" + inf.id[i]);
			System.out.println("Your Designation is:" + designatiom[i]);
			System.out.println("Your Dept is:" + inf.dept[i]);
			System.out.println("Your Mobile Num is:" + inf.mobile[i]);
			System.out.println("Your Gender is:" + inf.gender[i]);
			System.out.println("Your Address is :" + inf.address[i]);					
		}
	}

    void Tch_info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
