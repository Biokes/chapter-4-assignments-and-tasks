import java.util.Scanner;
public class TimesTable{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("pls enter a number: ");
double num  = input.nextDouble();
if(num <0){
System.out.print("enter a valid number");}
int count = 1;
while(count <= 12){
double ans = num * count;
System.out.printf("%.1f x  %d = %.1f\n", num,count,ans);
count+=1;
}
}
}