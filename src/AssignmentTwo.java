
public class AssignmentTwo {    //defined the class and class name

	// Different types of Data Types
	
Boolean one = false;	
byte y=25;              // global variable....variable initialisation	
short b;               
int c=130; 
long l=30;              
float z=10.5f;          
double d=20.5;         // also written as int d=20.5d;
char letter='A';
public static void main (String[] args) { 
	
	
	System.out.println("Assignment Two=");   
	
	AssignmentTwo demo = new AssignmentTwo ();  
    
	
System.out.println("Value of Boolean="+demo.one);
System.out.println("Value of Global Variable a="+demo.y);    
System.out.println("value of Global Variable b="+demo.b);   
System.out.println("Value of c="+demo.c);    
System.out.println("Value of l="+demo.l);
System.out.println("Value of f="+demo.z);
System.out.println("Value of d="+demo.d);
System.out.println("Value of A="+demo.letter);

     
      //local Variable declaration


int x=50;

System.out.println("Value of x="+x);



     // to print first character of name====Rushikesh


char firstName='R';     //  for char we use   '..'
String fName="R";

System.out.println("First Letter char="+firstName);
System.out.println("First Letter string="+fName);

}
}

