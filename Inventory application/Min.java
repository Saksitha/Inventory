package model;

public class Min {
	public static void main(String []args)
	{
	int a=3521;
	int b=2452;
	int c=1352;
	System.out.println(sm(a,b,c));
	}
	public static int sm(int input1,int input2,int input3)
	{
		input1=input1/100;
		input1=input1%10;
		input2=input2/10;
		input2=input2%10;
		int r=0;
		while(input3>0)
		{
		int h=input3%10;
		if(h>r)
		  r=h;
		input3=input3/10; 
		}
		return (input1*input2)*r;}
	}



