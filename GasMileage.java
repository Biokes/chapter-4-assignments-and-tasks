import java.util.Scanner;
public class GasMilleage{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int total = 0;
double gallons = 0;
double miles = 0;
double average;
double totalGallons= 0; 
System.out.println("pls enter total miles driven: ");
miles = input.nextDouble();
System.out.println("pls enter total miles driven: ");
gallons  = input.nextInt();
total +=miles;
totalGallons +=gallons;
while(miles >1){
System.out.println("pls enter total miles driven: ");
miles = input.nextDouble();
System.out.println("pls enter total miles driven: ");
gallons  = input.nextDouble();
total +=miles;
totalGallons +=gallons;
}
average = total/ totalGallons;
System.out.printf("%nThe average mile per gallon is %d", average);
System.out.printf("%nThe Total gallons used is %d", totalGallons);
System.out.printf("%nThe Total miles driven is %d", miles);
}}

