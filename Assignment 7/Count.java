/*Q4. write a java program to count number of words in a String.
Hint: You can use , trim() , length() and split() methods*/




package assignment7;

public class Count {

	public static void main(String[] args) {
		String a="NILESH GHOLE SIR IS VERY INTEGELLANT PERSON IN SUNBEAM AND HE IS MY MOTIVATION SALIUE U ";
         int cnt=1;
         for(int i=0;i<a.length();i++) {
        	 if(a.charAt(i)== ' ') {
        		 cnt ++; 
        	 }
        	 System.out.println("number of word="+cnt);
         }
	}

}
