import java.util.Scanner;
public class SalesCommission{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double total= 0;
double price = 0;
System.out.print("Enter the price of goods and 0 to stop: ");
price = input.nextDouble();
total+=price;
while(price != 0){
System.out.print("Enter the price of goods and 0 to stop: ");
price = input.nextDouble();
total+=price;
}
double commision = total * 0.09;
double salary =200 + commision;
System.out.printf("The salesman earning total is $%.3f.",salary);
}
}
