import java.util.Scanner;
public class ReverseNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter number a 5digit number: ");
int num = input.nextInt();
int rem= 0;
while(num>0){
int numb1=num %10;
rem =(rem *10) + numb1;
num = num/10;
 }
System.out.printf("Your 5 digit number reverse is %d. ",rem);
}
}