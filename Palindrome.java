import java.util.Scanner;
public class Palindrome{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter a five digit number: ");
int num = input.nextInt();
while(num /10000 <1 || num/10000 >9 ){
System.out.printf("%d is not a five digit number.\n",num);
System.out.println("pls enter a five digit number: ");
num = input.nextInt();
}
int num1 = num%10;
int num1s = num/10;
int num2 = num1s%10;
int num2s = num1s/10;
int num3 = num2s%10;
int num3s =num2s/10;
int num4 = num3s%10;
int num4s = num3s/10;

int num5 =(num1 * 10000)+(num2* 1000)+(num3*100)+(num4*10)+(num4s);

System.out.printf("%d reverse is %d.",num,num5);
if(num5 == num ){System.out.printf("\n%d is a palindrome.",num);}
else{System.out.printf("\n%d is not a palindrome.",num);}
}}