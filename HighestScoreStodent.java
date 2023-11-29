import java.util.Scanner;
public class HighestScoreStudent{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int high = 0;
String owner="";
System.out.print("pls enter the number you want to check if its a prime number: ");
int num = input.nextInt();
for(int i =0;i <num;i++){
System.out.printf("pls enter the name of student" +(i+1)+" : ");
String name = input.next();
System.out.printf("pls enter the Score of student" +(i+1)+" : ");
int numb = input.nextInt();
if(Score > high){
high = numb;
owner = name;
}
}
System.out.printf("The student with the highest Score is %s",owner);
}
}
