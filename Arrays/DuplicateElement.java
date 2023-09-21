package Week2.Arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int a=arr.length;
		for(int i=0;i<a-1;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
