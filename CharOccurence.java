package Week3.day4;

public class CharOccurence {
	public static void main(String[] args) {
		String a="welcome to chennai";
		char[] b=a.toCharArray();
		int c=0;
		for(int i=0;i<b.length;i++) {
			if('e'==b[i]) {
				c++;
			}
		}
			System.out.println(c);
		
	}

}
