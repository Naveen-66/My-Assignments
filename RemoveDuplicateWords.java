package Week3.day4;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String a="We learn java basics as part of java sessions in java week1";
		String[] b=a.split(" ");
		int c=0;
		//System.out.println(b);
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++) {
				if(b[i].equals(b[j])) {
					b[i]=" ";
					c++;
					//System.out.println(b[i]);
				}
			}
			if((b[i]==" ")&&(c>0)) {
				continue;
			}else {
				System.out.print(b[i]+" ");
			}
		}
		}
	}

