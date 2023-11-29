import java.util.Scanner;
public class Num{
public static void main(String[] args){
System.out.print("pls enter a number: ");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int ans= num%10;
System.out.printf("%n%d",ans);
}
}
