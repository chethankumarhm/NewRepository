package practise;

public class factorial {
	public static void fact(int a) {
		int j=1;
		for(int b=a;b>=1;b--) {
			j=j*b;
		}
			System.out.println(j);
		
	}
	public static void main(String[] args) {
		factorial.fact(5);
	}

}
