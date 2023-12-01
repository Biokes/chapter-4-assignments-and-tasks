import java.util.Scanner;
import java.security.SecureRandom;
public class GuessNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Guess a  number between 1 and 10: ");
int num = input.nextInt();
SecureRandom random = new SecureRandom();
int guess = random.nextInt(1,11);
while(num >10 || num<=0 ){System.out.print("Enter a valid number between 1 and 10:\n" );num = input.nextInt();}
if (num >0 && num <11){
while(num != 0){
if(guess > num){System.out.printf("Too low!!!.\n %d is the random number.\n %d is your number.\n",guess,num);}
if(guess < num){System.out.printf("Too high!!!.\n %d is the random number.\n %d is your number.\n",guess,num);}
if(guess == num){System.out.printf("correct!!!.\n %d is the random number.\n %d is your number.\n",guess,num);}
System.out.print("Guess a  number between 1 and 10: ");
 num = input.nextInt();
guess = random.nextInt(1,11);
while(num >10 || num<=0 ){System.out.print("Enter a valid number between:\n" );num = input.nextInt();}
}
}
}
}
