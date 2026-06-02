public class Main
{
	public static void main(String[] args) {
		int n=1234;
		int sum =1;
	while(n!=0){
	    int d = n%10;
	    n=n/10;
	
	    if(d%2==1){
	        sum =sum*d;
	    
	         
	    
	    }
	}
	System.out.println(sum);
	
	}
}
