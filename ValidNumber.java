import java.util.Scanner;
public class ValidNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count=1;
int number = 0;
int largest = 0;
while(number !=1 && number != 2){
System.out.print("Enter a valid Number (1,2): ");
number = input.nextInt();
}

while(number ==1 || number== 2){
System.out.printf("Enter Number(i.e 1,2) %d : ",count);
number = input.nextInt();
if(number>largest){
largest= number;
count+=1;
if(number != 1  && number != 2){
while(number !=1 && number != 2){
System.out.print("Enter a valid Number (1,2): ");
number = input.nextInt();
}
}

}
}
System.out.printf(" The largest number is %d.",largest);
}

}