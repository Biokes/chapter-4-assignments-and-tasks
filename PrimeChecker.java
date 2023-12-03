import java.util.Scanner;
public class PrimeChecker{
public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.print("Please enter a positive number: ");
int num = input.nextInt();
if(num <0){
System.out.printf("%d is a negative number and negative numbers are not prime numbers :).",num);
}
if(num>1){
int count = 1;
int factor = 0;
for(count =1; count <=num; count ++){
if(num % count == 0){
factor+=1;
}
}
if(factor >2){System.out.printf("%d is not a prime number.", num);}
else{System.out.printf("%d is a prime number.", num);}



}
}

}