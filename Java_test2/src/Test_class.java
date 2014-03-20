import java.util.Scanner;


public class Test_class extends input{					//inheritance
	//static int number=3;
	static int result;
	public static void main(String args[]){
		input in=new input();
		in.get_input();
		System.out.print(result);
		
	}
	
}
 class Example_stack{
	 static int i=0,j=0,k=0,t;
	 String stri[]=new String[30];
	 String res;
	 void push(String str)
	 {
		 stri[i]=str;
		 i++;
	 }
	 void pop()
	 {
		 i--;
	 }
	 void print()
	 {
		 while(j<i)
		 {
			System.out.print(stri[j]);
			j++; 
		 }
	 }
	 void calc()
	 {
		 while(k<i)
		 {
			 t=i;
			// if((stri[j]=="+")||(stri[j]=="-")||(stri[j]=="*")||(stri[j]=="/"))
			 if(stri[t]=="+")
			 {
				 res=stri[t-1]+stri[t+1];
				 System.out.println(res);
				 //pop();
			 }
			 k++;t--;
		 }
		
	 }
}
class input {
	int channel;
	String str=new String();
	Example_stack e_s=new Example_stack();
	@SuppressWarnings("resource")
	void get_input()
	{
		while(true){
			System.out.println("enter the operation" +
					"1.push"+"2.pop"+"3.print"+"4.calculate");
			
			Scanner sc=new Scanner(System.in);
			channel=sc.nextInt();
			switch(channel)
			{
			case 1:
			str=sc.next();
			e_s.push(str);
			break;
			
			case 2:
				e_s.pop();
				break;
			case 3:
				e_s.print();
				break;
			case 4:
				e_s.calc();
				break;
			default:
				break;
			}
		}
	}
}	