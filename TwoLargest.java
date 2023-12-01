import java.util.Scanner;
public class TwoLargest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count=1;
int largest =0;
int largest2 = 0;

while(count <= 10){
System.out.printf("Enter number %d: ",count);
int num= input.nextInt();
if(num > largest){largest = num;}
if(num < largest && num >=largest2){largest2 = num;}
count+=1;
}

System.out.printf("The two largest numbers are %d and %d.",largest,largest2);
}
}