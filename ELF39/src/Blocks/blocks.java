package Blocks;

public class blocks {
	 blocks(){
		     System.out.println("constructor Block");
		     }
	 static {
	         System.out.println("Static Block-1");
            }
	 static {
	         System.out.println("Static Block-2");
            }
	        {
	         System.out.println("Non-Static Block");
	        }
 
 public static void main(String[]args) {
	blocks block=new blocks();
	
 }
}
