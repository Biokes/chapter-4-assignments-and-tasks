import java.util.Scanner;
public class HCF{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.print("pls enter a number: ");
int num1 = input.nextInt();

System.out.print("pls enter another number: ");
int num2 = input.nextInt();
int high = 0;
int factor1 =0;
int factor2=0;

for(int i= 1;i <= num1;i++){

if(num1%i == 0){factor1 +=1;}
for(int j =1; j <= num2; j++){

if(num2%j == 0){factor2 +=1;}
if(j==i && num1%i == 0 && num2%j == 0 ){high = j;}
}
}
System.out.printf("\n%d is the highest common factor.",high);


}
}