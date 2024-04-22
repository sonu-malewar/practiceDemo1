package hackerEarth;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String s= "Automation";
		int count=0;
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				
				if(ch[i]==ch[j]) {
					
					System.out.println("found : "   +     ch[j]);
					count++;
					
				}
		}

		
		
	}
		System.out.println(count);	
		
		System.out.println("==============");
		int num=1234;
		int temp=0;
		int countNum=0;
		
		while(num>0) {
			
			num=num/10;
			num=temp+num;
			
			countNum++;
			
		}
		System.out.println("count of number: " +countNum);
}}
