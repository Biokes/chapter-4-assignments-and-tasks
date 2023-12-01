import java.util.Scanner;
public class Item{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("pls enter item name : ");
String item  = input.next();
System.out.print("pls enter item price: ");
int itemp  = input.nextInt();
double discount = (itemp*0.1);
double price = itemp - discount;
System.out.printf("the price of %s with 10%%discount is %.2f ",item,price);
System.out.printf("the price is %d",item);
System.out.printf("discount is 10%% ");

System.out.printf("the price of %s with 10%%discount is %.2f ",item,price);
}
}
