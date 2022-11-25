package practise;

class practice {
	public static void main(String[]args) {
		String s="1a2b3c";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=0&&c[i]<=3) {
				System.out.print(Integer.parseInt(c[i]+""));
			}
			else {
			System.out.print(c[i]+"");
			}
		}
	}
}
