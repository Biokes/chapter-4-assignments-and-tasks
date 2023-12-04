import java.util.Scanner;
public class Factorial{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to get its factorial value: ");
int num = input.nextInt();
while(num < 0){
System.out.print("INVALID NUMBER FOR FACTORIAL!!!\n pls enter a valid number:");
num = input.nextInt();
}
switch(num){
case(0):
System.out.println("The factorial value of 0 is 1.");
break;
}
int sum = 1;
int count = 1;
while( count <= num){
sum*=count;
count++;
}
System.out.println("The factorial of "+ num + " is " + sum);
System.out.print("Enter a number to get its CONSTANT value: ");
int num1 = input.nextInt();
while(num1 < 0){
System.out.print("INVALID NUMBER FOR CONSTANT!!!\n pls enter a valid number:");
num1 = input.nextInt();
}
switch(num){
case(0):
System.out.println("The constant value of 0 is 1.");
break;
}
int counter =1;
int factorial = 1;
double addUp=1.0;
while(counter <= num1){
int sum1 = 1;
int count1 = 1;
while( count <= num){
sum1*=count1;
count1++;
}
factorial*= counter;
counter++;
addUp +=1.0/factorial;
}
System.out.println("The Constant value of " + num1 + " is " + addUp);



}
}