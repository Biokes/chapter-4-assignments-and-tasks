import java.util.Scanner;
public class Fibonacci{
public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter a number you want: ");
int num = input.nextInt();
for(int i = 0;i <= num; i++){
int num1= i-1;
if (num1 <= 0 ){num1 =0;}
if(i==0){System.out.printf("%d,",num1);}
else{
System.out.printf("%d,",i+(num1));}
		}
	}
}