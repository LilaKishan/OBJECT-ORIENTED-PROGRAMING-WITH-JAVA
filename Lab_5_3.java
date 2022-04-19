import java.util.Scanner;
class Vowel
{
	Scanner input=new Scanner(System.in);
	String s1,s2;
		
	int count_e=0,count_a=0,count_i=0,count_o=0,count_u=0;
	
	void getDetails()
	{
		do{
			System.out.print("enter sentence : ");
			s1 = input.next();
			int l =s1.length();
			String s2= s1.toLowerCase();

			for (int i=0;i<l ;i++){
				if (s2.charAt(i)=='a'){
					count_a++;
				}
				if (s2.charAt(i)=='e'){
					count_e++;
				}
				if (s2.charAt(i)=='i'){
					count_i++;
				}
				if (s2.charAt(i)=='o'){
					count_o++;
				}
				if (s2.charAt(i)=='u'){
					count_u++;
				}
			}
		}while(!s1.equals("quit"));
			count_u--;
			count_i--;

	}

	void display(){
		System.out.println("a = "+count_a);
		System.out.println("e = "+count_e);
		System.out.println("i = "+count_i);
		System.out.println("o = "+count_o);
		System.out.println("u = "+count_u);
	}
}
public class Lab_5_3{
	public static void main(String[] args){
		Vowel sc=new Vowel();

		sc.getDetails();
		sc.display();
	}
}	