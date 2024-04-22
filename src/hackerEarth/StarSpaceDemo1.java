package hackerEarth;

public class StarSpaceDemo1 {
	
	public static void main(String[] args) {
		
	//     *
	//	 * * *
	//  * * * * *
		

// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++){

		     for(int s=2;s>i;s--){

		        System.out.print(" ");

		      }

		      for(int k=1;k>=(2*i-1);k++){

		         System.out.print("*");

		       }
           
		      System.out.println();
		}

	}

}

