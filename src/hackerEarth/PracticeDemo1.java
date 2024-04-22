package hackerEarth;

public class PracticeDemo1 {
	
	// cal fact of num=5
	static int fact=1;
	 int num;
	public static int calFactorial(int num) {
		
		if(num>1) {
			
		//num=fact*num;
		
		num= calFactorial(num-1)*num;
		
		
		}
		return num ;
		
		
	}
	public static void main(String[] args) {
		
		int fact = PracticeDemo1.calFactorial(6);
		System.out.println(fact);
		
	}

}
