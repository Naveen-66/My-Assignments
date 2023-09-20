package Week2.Day2;

public class Fibonacci {


		public static void main(String[] args) {

			int a=0,b=1,c=0;

			System.out.print(a+" "+b);


			for(int i=1;i<=11;i++) {  

				c=a+b;

				System.out.print(" "+c);

				a=b;
				b=c;

			}
		}

	}

