package Week2.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		int a=arr.length;
		int t;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=1;i<=a;i++)
		{
		if(arr[i-1]!=i)
			{
			System.out.println(i);
			break;
			}
		}
	}

}
