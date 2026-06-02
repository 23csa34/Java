
public class Main
{
	public static void main(String[] args) {
		int n=1234;
		while(n!=0){
		    int d=n%10;
		    n=n/10;
		   if(d%2==0){
		       System.out.print(d);
		   }
		}
	}
}
