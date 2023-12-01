public class MavericksBank{
private String name;
private String lastName;
private int pin;
private int day;
private int month;
private int year;
private double balance;
public MavericksBank(String name,String lastName,int pin,int day,int month, int year,double balance){
this.name = name;
this.lastName= lastName;
this.pin= pin;
this.day=day;
this.month= month;
this.year= year;
this.balance = balance;
}
public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public String getLastName(){
return lastName;
}
public void setPin(int pin){
While((pin /1000)>9 || (pin/1000<0)){
System.out.println("invalid pin!!!.\n pls creat a 4 digit pin");
}if(pin /1000)<9 || (pin/1000>0)){
this.pin = pin;
}
}
public int getPin(){
return pin;
}
public void setDay(int day){
while(day>31){System.out.print("invalid day!!!. pls set a valid date.");
}if(day <=31){this.day = day;
}
}
public int getDay(){
return day;
} 
public void setMonth(int month){
if(month>12){System.out.print("invalid month!!!. pls set a valid month.");
}else{this.month = month;
}
}
public int getMonth(){
return month;
}
public void setYear(int year){
this.year = year;
}
public int getYear(){
return year;
}
public void setBalance(double Balance){
if(balance <0.0){
System.out.print("pls enter a valid amount!!!");
}else{
this.balance = balance;
}
}
public double getBalance(){
return balance;
}
public double deposit(double deposit){
balance+= deposit;
return balance;
}
public double withdraw(double withdraw){
balance-=withdraw;
return balance;
}

}