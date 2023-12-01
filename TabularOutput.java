public class TabularOutput{
public static void main(String[] args){
int num = 0;
int square = num *num;
int cube = num *num*num;
int biquadrate = num*num*num*num;
System.out.println("number\t Square\tcube\tbiquadrate");
while(num <=5){
System.out.printf("%d\t %d\t%d\t%d\n",num,square,cube,biquadrate);
num+=1;
square = num *num;
cube = num *num*num;
 biquadrate = num*num*num*num;

}
}
}