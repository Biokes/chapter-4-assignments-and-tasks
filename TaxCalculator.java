import java.util.Scanner;
public class TaxCalculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count =1;
double total = 0;
double tax = 0;
while(count<=3){
System.out.print("Enter a citizen name: ");
String name1 = input.next();
System.out.print("Enter a citizen earnings: ");
double num1 = input.nextInt();
if(num1 <=30000){
tax = num1 * 0.15;
System.out.printf("%s's tax rate is $%.1f.",name1,tax);
}else if(num1>30000 ){
tax = num1 * 0.2;
System.out.printf("%s's tax rate is $%.1f.\n",name1,tax);
}
count +=1;
total =total + tax;
}
System.out.printf("\nThe total tax Rate is $%.1f.",total);
}
}
