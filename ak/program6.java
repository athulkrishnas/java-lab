import java.io.*;
public class Program6{
   public static void main(String[] args){
	int n=7;
		Program6 fact = new Program6();
		fact.Fact(n);
	}
	void Fact(int n){
		int i=1,a=1;
		while(i<=n)
		{
			a*=i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+a);
	}

}
		