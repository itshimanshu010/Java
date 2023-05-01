

import java.util.Scanner;

public class Greatest 
{
	
	int num1,num2,num3;
	
	void getdata()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number= ");
		num1=input.nextInt();
		System.out.println("Enter second number= ");
		num2=input.nextInt();
		System.out.println("Enter third number= ");
		num3=input.nextInt();
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("Greatest is "+num1);
		}
		
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("Greatest is "+num2);
		}
		
		else if(num3>=num1 && num3>=num2)
		{
			System.out.println("Greatest is "+num3);
		}
		
		else
		{
			System.out.println("All are Equal");
		}
	}



	public static void main(String[] args) 
	{
		
		Greatest g=new Greatest();
		g.getdata();

	}

}
