import java.util.Scanner;
public class LoopPractice{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("pls enter a number: ");
int num = input.nextInt();
int prime;
for(int check = 2 ; check = num ; check++){
while(true){
if( num / check == 0 || num / check>1){
 System.out.printf("%d is not a prime number.",num);
break; 
}
else{
System.out.printf("%d is a prime number.",num);
check+=1;
}
}
}
}
}
