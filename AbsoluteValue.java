import java.util.Scanner;
public class AbsoluteValue{
public static void main(String[] args) {
Scanner inout = new Scanner(System.in);
Scanner input = new Scanner(System.in);
System.out.print("pls enter a number: ");
int num = input.nextInt();
int abs = 0;
if(num >=0){
abs = num- abs;
System.out.printf("the absolute value for %d is %d",num ,abs);
}
if(num <0){
abs = num* (-1)- abs;
System.out.printf("the absolute value for %d is %d",num ,abs);
}
}
}