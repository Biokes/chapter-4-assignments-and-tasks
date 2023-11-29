import java.util.Scanner;
public class PrimeNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter the number you want to check if its a prime number: ");
int num = input.nextInt();
int i = 0;
for(i =2;i <num;i++){
	if(num%i==0){
		System.out.printf("%d is not a prime number",num);
	return;
}
}

System.out.printf("%d is a prime number",num);
}
}