import java.util.Scanner;
public class Loop1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int digit=1;
for(digit = 1; digit <=10;digit++){
System.out.printf("%d.",digit);
}
int counter = 0;
int total =0;
int i=1;
for(i= 1;i<= 10; i++){
counter+=1;
total +=i;
if(counter == 10){
System.out.printf("\nThe sum of the first 10 natural number is %d.\n",total);
}
}
System.out.print("pls enter a number to get its multiplication table: ");
int num = input.nextInt();
for(i= 1;i<= 12; i++){
System.out.printf("%d X %d = %d\n",num,i,num*i);
}
System.out.print("pls enter a number to get its factorial value: ");
int answer =  input.nextInt();
int sum =1;
int count = answer;
for(i =1; i <= answer;i++){
sum=sum*i;
}
System.out.printf("%d factorial is %d\n\n",answer,sum);
}
}
