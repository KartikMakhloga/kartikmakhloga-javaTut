/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

package Unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorsInJava obj = new OperatorsInJava();
		
		obj.unaryop();
		obj.arithmatic();
		obj.shiftop();
		obj.relationalop();
		obj.bitwiseAndLogical();
		obj.ternaryop();
		obj.assignop();
	}
}
		
		class OperatorsInJava
		{
			void unaryop() {
				int a=10;
				System.out.println(a++);
				System.out.println(++a);
				System.out.println(a--);
				System.out.println(--a);
				
				
			}
			void arithmatic()
			{
				int a=10,b=5;
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a*b);
				System.out.println(a/b);
				System.out.println(a%b);
			}
			void shiftop()
			{
				System.out.println(10<<2);
				System.out.println(10>>2);
			}
			void relationalop() {
				int a=10,b=5;
				System.out.println(a==b);
				System.out.println(a!=b);
				System.out.println(a>=b);
				System.out.println(a<=b);
			}
			void bitwiseAndLogical()
			{
				int a=10,b=5,c=20;
				System.out.println(a<b && a++<c);
				System.out.println(a);
				
				System.out.println(a<b & a++<c);
				System.out.println(a);
			}
			
			void ternaryop() {
				System.out.println("Inside ternary operator");
				
				int a=2, b=5;
				int min= (a>b)?b:a;
				System.out.println(min);
				System.out.println("\n");
			}
			
			void assignop() {
				System.out.println("Inside Assignment Operator");
				
				int a=10, b=20;
				a+=4;
				b-=4;
				System.out.println(a);
				System.out.println(b);
				
				b>>>=2;
				System.out.println(b);
			}
			

	}