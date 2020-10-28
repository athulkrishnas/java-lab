import java.io.*;
public class Program9{
	public static void main(String[] args) {
	 int m=13331;
	 Program9 obj = new Program9();
	 obj.Pal(m);
	}
	void Pal(int n){
		int num=n,sum=0,a;    
		 while(n>0){    
			 a=n%10;  
			 sum=(sum*10)+a;    
			 n=n/10;			
		 }    
		 if(num==sum)    
			 System.out.println(num+" is a palindrome number.");    
		 else    
			 System.out.println(num+" is not a palindrome number.");
	}
	
}