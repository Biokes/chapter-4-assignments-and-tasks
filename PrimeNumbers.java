import java.util.Scanner;
public class PrimeNumbers{
public static void main(String... args){
System.out.print("pls enter a number to check if it is a prime Number: ");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if(num == 2){
System.out.printf("%d is a prime number.",num);
}
if(num < 2){
System.out.printf("%d is not a prime number.",num);
}
if(num >2){
int counter = 1;
int factor = 0;
while(counter != num){
if(num% counter == 0){
factor+=1;
counter+=1;
}else{counter+=1;}
}
if(factor >2){
System.out.printf("%d is not a prime number.",num);}
else{System.out.printf("%d is a prime number.",num);}

}
}
}