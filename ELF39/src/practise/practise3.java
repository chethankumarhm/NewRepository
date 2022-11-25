package practise;

public class practise3 {
	public static void main(String[] args) {
		char k='A';
	for(int a=1;a<=4;a++) {
		for(int b=3;b>=a;b--) {
			System.out.print(" ");
		}
		for(int b=1;b<=a;b++) {
			System.out.print(k);
			k++;
		}
		k='A';
		System.out.println();
	}

}


}



