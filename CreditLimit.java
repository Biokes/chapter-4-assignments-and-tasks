import java.util.Scanner;
public class CreditLimit{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter account number: ");
String account = input.next();

System.out.println("Enter balance at the beginning of the month: ");
int balance = input.nextInt();

System.out.println("Enter total of all amount charged by the customer this month: ");
int charges = input.nextInt();
 
System.out.println("Enter total of all credit applied to the customer's account this month: ");
int credit = input.nextInt();

System.out.println("Enter allowed credit limit: ");
int limit = input.nextInt();

if(credit > limit){
System.out.print("Credit limit exceeded!!!\n");
}
balance = balance + charges - credit;
if(balance < 0){
int newBalance = balance *(-1);
System.out.printf("Account %s is owing $%d.",account,newBalance);
}else if(balance >=0){
System.out.printf("The new balance of account %s  is $%d.%n",account,balance);
}
}
}