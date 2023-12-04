import java.util.Scanner;
public class DoWhileAsterisks{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Pls enter a number: ");
int num = input.nextInt();
System.out.println("Pls enter another number: ");
int num1 = input.nextInt();
int fake =1;
int fake2 = 1;
while(fake != num){
	while(fake2 != num1){
		System.out.print("*");
		fake2+=1;
	}
System.out.println("");
fake +=1;
}
}
}