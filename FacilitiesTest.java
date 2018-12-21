package FacilityKLU;
import java.util.Scanner;
import Facility.Facilities;
public class FacilitiesTest 
{
	public static void main(String[] args) 
	{
		Facilities ft=new Facilities();
		int op,x;
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome to KL University Information System");
		System.out.print("1.Sports\n2.Faculty Info\n3.Degrees Offered\n4.Branches Offered\n5.Transport Facilities\n6.Exit\n");
		op=sc.nextInt();
		switch(op)
		{
			case 1:ft.Sports(); 
				break;
			case 2: ft.Finfo();
				break;
			case 3:ft.Doffer(); 
				break;
			case 4:ft.Boffer();
				break;
			case 5:ft.Transport(); 
				break;
		}
	}
}