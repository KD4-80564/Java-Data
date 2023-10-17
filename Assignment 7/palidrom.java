package assignment7;

public class palidrom {

	public static void main(String[] args) {
  
	String str="Radar",reversestr=" ";
	int strlength=str.length();
	
	for(int i=(str.length()-1);i>=0;--i) {
		reversestr=reversestr +str.charAt(i);
	}
	if(str.toLowerCase().equals(reversestr.toLowerCase())) {
		System.out.println("string is palirdom"+str);
	}
	else
	{
		System.out.println("string is not palidrom"+str);
	}
	
	}

}
