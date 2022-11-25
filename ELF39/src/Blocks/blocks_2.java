package Blocks;

public class blocks_2 extends blocks_1{
blocks_2(){
	      this(1);
	      System.out.println("constructor-3");
          }
          {
          System.out.println("non-static block-3");	  
          }
    static{
    	  System.out.println("static block-2");
          }
blocks_2(int a){
		  System.out.println("constructor-2");
          }
public static void main(String[]args) {
	blocks_2 block=new blocks_2();
}
}
