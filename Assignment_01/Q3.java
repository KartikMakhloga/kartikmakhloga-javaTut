package Assignment_01;

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		testClass obj = new testClass();
		
		Scanner o = new Scanner(System.in);
		int a = o.nextInt();
		
		obj.display(a);

	}

}

interface in1
{
	void display();
}

class testClass
{
	public void display(int p)
	{
		 int i,m=0,flag=0;      
		  m=p/2;      
		  if(p==0||p==1){  
		   System.out.println(p+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(p%i==0){      
		     System.out.println(p+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(p+" is prime number"); }  
		  }
	}
}