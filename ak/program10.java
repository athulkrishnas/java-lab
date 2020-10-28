import java.io.*;
public class Program10{
	public static void main(String[] args) {
	 int m=153;
	 Program10 obj = new Program10();
	 obj.Amst(m);
}
void Amst(int n)
{
	int a=0,b,c; 
	c=n;  
	while(n>0)  
	{  
	    b=n%10;  
	    n=n/10;  
	    a=a+(b*b*b);  
	 }  
         if(c==a)  
	    System.out.println(c+" is an amstrong number.");   
	 else  
	     System.out.println(c+" is not an amstrong number."); 
	}

}