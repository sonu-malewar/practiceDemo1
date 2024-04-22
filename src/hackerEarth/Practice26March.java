package hackerEarth;

import java.util.Arrays;

public class Practice26March {

	public static void main(String[] args) {
		
		char ch[] = {'a','s','d','f','r'};
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(ch[i]);
		}
		
		ch[1]='n';
		
		System.out.println(Arrays.toString(ch));
	}

}
