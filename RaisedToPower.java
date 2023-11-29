import java.util.Scanner;
public class RaisedToPower{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter a number: ");
int num = input.nextInt();
System.out.print("pls enter another number: ");
int num1 = input.nextInt();
int counter = 0;
int sum =1;
int i= 0;
for(i = 1;i <=num1;i++){
sum*=num;
}
System.out.printf("%d equals %d when raised to the power of %d",num,sum,num1);
}
}