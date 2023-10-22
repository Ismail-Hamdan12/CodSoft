package codsoft;
import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
       	String Name;       
		int English,Maths,Social,Science,Tamil,Total;
		double Average_Percentage;
    System.out.println("Enter the Student Name : ");
    Name = c.nextLine();
	System.out.println("Enter the English Mark : ");
    English = s.nextInt();	
	System.out.println("Enter the Maths Mark : ");
    Maths = s.nextInt();	
	System.out.println("Enter the Social Mark : ");
    Social = s.nextInt();	
	System.out.println("Enter the Science Mark : ");
    Science = s.nextInt();	
	System.out.println("Enter the Tamil Mark : ");
    Tamil = s.nextInt();	
	System.out.println();
	Total = English+Maths+Social+Science+Tamil;
	System.out.println("The Student Name : "+Name);
    System.out.println("The Total Mark of a Student is : "+Total);
	Average_Percentage=Total/5;
	System.out.println("The  of a Student is : "+Average_Percentage);
	    if(Average_Percentage<=100 && Average_Percentage>=90)
		System.out.println("Grade A1");
	else if(Average_Percentage<=90 && Average_Percentage>=80)
		System.out.println("Grade A2");
	else if(Average_Percentage<=80 && Average_Percentage>=70)
		System.out.println("Grade B1");
	else if(Average_Percentage<=70 && Average_Percentage>=60)
		System.out.println("Grade B2");
	else if(Average_Percentage<=60 && Average_Percentage>=50)
		System.out.println("Grade C1");
	else if(Average_Percentage<=50 && Average_Percentage>=40)
		System.out.println("Grade C2");
	else if(Average_Percentage<=40 && Average_Percentage>=30)
		System.out.println("Grade D");
	else
		System.out.println("Grade E");
		
	}

}
