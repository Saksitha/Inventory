package model;

public class Minnof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int a=3521;
			int b=2452;
			int c=1352;
			int a1[]= {a,b,c};
			int min[]=new int[3];
			int max[]=new int[3];
			for(int i=0;i<a1.length;i++)
			{
				int min1=0;int max1=0;
				int d=a1[i]%10;
				while(a1[i]!=0)
				{
					if(min1<d)
					{
						min1=d;
						min[i]=min1;
					}
					if(max1>d) 
					{
						max1=d;
						max[i]=max1;
					}
				}
			}
			System.out.println((min[0]+min[1]+min[2])-(max[0]+max[1]+max[2]));
			}
	}
}

