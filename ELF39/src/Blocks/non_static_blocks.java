package Blocks;

public class non_static_blocks {
	
	non_static_blocks(){
		   System.out.println("constructor block-3");
	       }
	
	       {
		   System.out.println("non-static block-1");
	       }
	
	       {
		   System.out.println("non-static block-2");
	       }
	
	public static void main(String[]args) {
		non_static_blocks block=new non_static_blocks();
	}
}
