import java.util.Scanner;
public class Question30{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("pls enter a number and enter '0' to stop: ");
int num1 = input.nextInt();
int count = 0;
int plus = 0;
int minus = 0;
if(num1 >=1){
plus =1;}
else if(num1 <=-1){
minus=1;}
double average =0;
int total=num1;
if(num1 != 0 ){
int num =1;
while(num != 0){
System.out.println("pls enter a number and enter '0' to stop: ");
num = input.nextInt();
count+=1;
if(num >=1){plus +=1;}
else if(num <=-1){minus+=1;}
total+=num;
}
}
average = total/count;
System.out.printf("The total of the numbers entered is %d.%n",total);
System.out.printf("The Average of the numbers entered is %.2f.%n",average);
System.out.printf("The Total numbers entered is %d.%n",count);
System.out.printf("The Total Negative numbers entered is %d.%n",minus);
System.out.printf("The Total Positive numbers entered is %d.%n",plus);

	}
}