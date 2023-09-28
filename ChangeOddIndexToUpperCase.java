package Week3.day4;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String a="changeme";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(i%2!=0) {
				b[i]=Character.toUpperCase(b[i]);
			}
		}
		System.out.println(b);
	}

}
