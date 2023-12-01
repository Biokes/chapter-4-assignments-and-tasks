import java.util.Scanner;
public class ValidNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int number = 0;
int largest = 0;
while(number !=1 || number!= 2){
System.out.print("Enter a valid Number (1,2): ");
number = input.nextInt();
if(number>largest){
largest= number;
}
}
System.out.printf("The largest number is %d.",largest);
}
}