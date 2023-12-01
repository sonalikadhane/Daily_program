package java_program;

import java.util.Scanner;

public class Example
{
	static int i,j,temp,cal,size=10;
	static  int[] num=new int[size];
	
	public static void main(String[] args)
	{
       accept();
       smallest();
      accept();
      ascending();
      accept();
      descending();
	}
		public static void accept()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		
		System.out.println("Enter "+size+" numbers");
		// Accepting the array numbers
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		}
		public static void smallest()
		{
		cal=num[0];
		System.out.println("The numbers are");
		//Display the value of the array
		for(i=0;i<size;i++)
		{
			System.out.println("num="+num[i]);
			if(num[i]<cal)
			{
				cal=num[i];
			}
			
		}
		
		System.out.println("The smallest no is ="+cal);
	}
    
		public static void ascending()
		{
			int temp;
			for(i=0;i<size;i++)
			{
				for(j=i+1;j<size;j++)
				{
					if(num[i]>num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			System.out.println("Numbers in ascending order: ");
			for(i=0;i<size;i++)
				System.out.print("\t"+num[i]);
			System.out.println();
		}
		 public static void descending()
		 {
			 int temp;
				for(i=0;i<size;i++)
				{
					for(j=i+1;j<size;j++)
					{
						if(num[i]<num[j])
						{
							temp=num[i];
							num[i]=num[j];
							num[j]=temp;
						}
					}
				}
				System.out.println("Numbers in descending order: ");
				for(i=0;i<size;i++)
					System.out.print("\t"+num[i]);
				System.out.println();

		
         }
      }

