package Week3.day3;

public class Reverse {
public static void main(String[] args) {
	String a="feeling good";
	char[] b=a.toCharArray();
	for(int i=b.length-1;i>=0;i--)
	{
		System.out.print(b[i]);
	}
}
}
