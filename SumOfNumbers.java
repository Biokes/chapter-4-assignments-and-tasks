import java.util.Scanner;
public class SumOfNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter number a number and enter 0 to Stop: ");
int num = input.nextInt();
int even = 0;
int odd = 0;
if(num != 0){
while(num != 0){
if(num %2 == 0){even +=1;}
if(num %2 == 1){odd +=1;}
System.out.print("pls enter a number and enter 0 to Stop: ");
num = input.nextInt();
}
}else{System.out.printf("The total number is 0.");}
System.out.printf("The total odd numbers in the set is %d.%n",odd);
System.out.printf("The total even numbers in the set is %d.",even);
}
}