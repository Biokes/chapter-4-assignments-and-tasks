public class Armstrong{
public static void main(String...args){
	for(int num = 100; num <= 500; num++){
int num1=num %10;
int num2 = (num%100)/10;
int num3 = num/100;
int armstrong= (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
	if(num == armstrong){System.out.printf("%d,",num);}
		}
	}
}