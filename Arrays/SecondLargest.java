package Week2.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int a[] = {3,2,11,4,6,7};
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{	
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			}
		}
	}
	System.out.println(a[1]);
}
}
