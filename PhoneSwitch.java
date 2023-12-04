import java.util.Scanner;
public class PhoneSwitch	{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("DISPLAY MENU: ");
System.out.println("1. PhoneBook.");
System.out.println("2. Messages.");
System.out.println("3. Chat.");
System.out.println("4. Call Register.");
System.out.println("5. Tones.");
System.out.println("6. Settings.");
System.out.println("7. Call Divert.");
System.out.println("8. Games.");
System.out.println("9. Calculator.");
System.out.println("10. Reminder.");
System.out.println("11. Clock.");
System.out.println("12. Profiles.");
System.out.println("13. Sim Services.");
System.out.print("DISPLAY MENU->(Enter their number to access them!!!): ");

int menu = input.nextInt();
while( menu <1 || menu >13){
System.out.print("INVALID NUMBER!!! Enter their number to access them!!!: ");
menu = input.nextInt();
}
switch(menu){

case(1):
System.out.println("PHONEBOOK MENU:  ");
System.out.println("1. Search.");
System.out.println("2. Service Nos.");
System.out.println("3. Add Name.");
System.out.println("4. Erase.");
System.out.println("5. Edit.");
System.out.println("6. Assign Tone.");
System.out.println("7. Spend B' Card.");
System.out.println("8. Options.");
System.out.println("9. Speed Dials.");
System.out.println("10. Voice Tags.  : ");

System.out.println("PHONEBOOK MENU->(Enter their number to access them.):  ");
int phoneBookChoice = input.nextInt();
while(phoneBookChoice <1 || phoneBookChoice>10){
System.out.println("INVALID NUMBER!!!\nOPTIONS MENU:\nEnter their Number to Access them: ");
phoneBookChoice = input.nextInt();
}
switch(phoneBookChoice){
case(1):
System.out.println("Search: ");
break;
case(2):
System.out.println("Service Nos: ");
break;
case(3):
System.out.println("Add Name: ");
break;
case(4):
System.out.println("Erase: ");
break;
case(5):
System.out.println("Edit: ");
break;
case(6):
System.out.println("Assign Tone: ");
break;
case(7):
System.out.println("Spend B' Card: ");
break;
case(8):
System.out.println("OPTIONS MENU:\nEnter their Number to Access them: ");
System.out.println("1. Type of View.\n2. Memory Status");
int options= input.nextInt();
while(options <1 || options >2){
System.out.println("INVALID NUMBER!!!\nOPTIONS MENU:\nEnter their Number to Access them: ");
options = input.nextInt();
}
switch(options){
case(1):
System.out.print("Type of view:");
break;
case(2):
System.out.print("Memory Status:");
break;
}
break;
case(9):
System.out.println("Speed Dials: ");
break;
case(10):
System.out.println("Voice Tags: ");
break;
}


break;

case(2):
System.out.println("MESSAGES MENU: ");
System.out.println("1. Write Messages.");
System.out.println("2. Inbox.");
System.out.println("3. Outbox.");
System.out.println("4. Picture Messages.");
System.out.println("5. Templates.");
System.out.println("6. Smiley.");
System.out.println("7. Mesages Settings.");
System.out.println("8. Options.");
System.out.println("9. Speed Dials.");
System.out.println("10. Voice Tags.");
System.out.println("MESSAGES MENU:->(Enter the Mesages menu number to Access Them.)");
int messagesChoice = input.nextInt();
while(messagesChoice <1 || messagesChoice > 10){
System.out.println("INVALID INPUT!!!\n Pls enter a valid number: ");
messagesChoice = input.nextInt();
}
switch(messagesChoice){
case(1):
System.out.print("Write Messages: ");
break;
case(2):
System.out.print("Inbox: ");
break;
case(3):
System.out.print("Outbox: ");
break;
case(4):
System.out.print("Picture Messages: ");
break;
case(5):
System.out.print("Templates: ");
break;
case(6):
System.out.print("Smiley: ");
break;
case(7):
System.out.print("Messages Settings menu: ");
System.out.println("1. Set.\n2. Common.\n");
System.out.println("MESSAGES SETTING MENU:->(Enter the Mesages menu number to Access Them.)");
int messagesSetting = input.nextInt();
while(messagesSetting <1 || messagesSetting>2){
System.out.println("INVALID NUMBER!!!\nMessages Setting Menu:->(Enter the Mesages menu number to Access Them.)");
messagesSetting = input.nextInt();
}
switch(messagesSetting){
case(1):
System.out.println("SET MENU:\n1. Message center number.\n2.Message sent as.\n3. Message Validity");
break;
case( 2):
System.out.println("COMMON MENU:\n1. Message center number.\n2.Message sent as.\n3. Message Validity");
break;
}
case(8):
System.out.print("Info Services: ");
break;
case(9):
System.out.print("Voice Mailbox number: ");
break;
case(10):
System.out.print("Service Command Editor: ");
break;
}


case(3):
System.out.println("CHAT MENU: ");
break;

case(4):
System.out.println("CALL REGISTER MENU: ");
System.out.println("1. Missed Calls.");
System.out.println("2. Recieved calls.");
System.out.println("3. Dialled Numbers.");
System.out.println("4. Erase Recent call list.");
System.out.println("5. Show Call Duration.");
System.out.println("6. Show All Costs.");
System.out.println("7. All Calls costs.");
System.out.println("8. Prepaid Credit.");
System.out.println("CALL REGISTER MENU:->(Enter the Call Register menu number to Access Them.)");
int callRegister = input.nextInt();
while(callRegister <1 || callRegister>8){
System.out.println("INVALID NUMBER!!!\nCALL REGISTER MENU:->(Enter their number to Access Them.): ");
callRegister = input.nextInt();
}

switch(callRegister){
case(1):
System.out.print("Missed Calls: ");
break;
case(2):
System.out.print("Recieved Calls: ");
break;
case(3):
System.out.print("Dialed Calls: ");
break;
case(4):
System.out.print("Erase Recent call list: ");
break;
}
break;

case(5):
System.out.print("TONES MENU: ");
System.out.println("1. Ringing tone.");
System.out.println("2. Ringing Volume.");
System.out.println("3. Incoming Call Alert.");
System.out.println("4. Composer.");
System.out.println("5. Message Alert Tone.");
System.out.println("6. KeypadTones.");
System.out.println("7. Warning and game Tones.");
System.out.println("8. Vibrating Alert.");
System.out.println("9. Screen Saver.");
System.out.println("Enter their number to Access them: ");
int callDuration = input.nextInt();
while(callDuration <1 || callDuration > 5){System.out.println("INVALID NUMBER!!!\nSHOW CALL DURATION MENU:->(Enter the Mesages menu number to Access Them.)");
callDuration = input.nextInt();}
switch(callDuration){
case(1):
System.out.print("Last call Duration: ");
break;
case(2):
System.out.print("All calls duration: ");
break;
case(3):
System.out.print("Recieved calls Duration: ");
break;
case(4):
System.out.print("Dailled calls counters: ");
break;
case(5):
System.out.print("Clear Timers: ");
break;
}
break;

case(6):
System.out.print("SETTING MENU: ");
System.out.println("1. Call Settings.");
System.out.println("2. Phone Setting.");
System.out.println("3. Security Setting.");
System.out.println("4. Restore Factory Setting.");
System.out.println("SETTING MENU:->(Enter the Setting menu number to Access Them.)");
int setting = input.nextInt();
while(setting <1 || setting >4){System.out.println("INVALID NUMBER!!!\nSETTING MENU:->(Enter the Mesages menu number to Access Them.)");
setting = input.nextInt();
}
switch(setting){
case(1):
System.out.println(" CALL SETTING MENU:\n1. Automatic redial.\n2. Speed Dialing\n3. Call waiting Options.\n4. Own number Sending.\n5. Phone number in use.\n6. Automatic Answer. ");
System.out.println("CALL SETTING MENU:->(Enter the Setting menu number to Access Them.)");
int callSetting = input.nextInt();
while(callSetting <1 || callSetting >6){System.out.println("INVALID NUMBER!!!\nCALL SETTING MENU:->(Enter the Mesages menu number to Access Them.)");
callSetting = input.nextInt();
}
switch(callSetting){
case(1):
System.out.println("Automatic Redial:");
break;
case(2):
System.out.println("Speed Dialing:");
break;
case(3):
System.out.println("Call waiting Options:");
break;
case(4):
System.out.println("Own Number Sending:");
break;
case(5):
System.out.println("Phone Number in use:");
break;
case(6):
System.out.println("Automatic Answer:");
break;
}
case(2):
System.out.println("PHONE SETTING MENU:\n1.Language.\n2. Cell info Display.\n3. Welcome Note.\n4. Network Selection.\n5. Lights.\n6. Automatic Answer.");
break;
case(3):
System.out.println("SECURITY SETTING MENU:\n1.PIN code request.\n2. Call Barring Service.\n3. Fixed dialling.\n4. Closed User Group.\n5. Phone Security.\n6. Change Access Codes.");
break;
case(4):
System.out.println("RESTORE fACTORY SETTING:");
break;
}

break;

case(7):
System.out.print("CALL DIVERT.");
break;

case(8):
System.out.print("GAMES.");
break;

case(9):
System.out.print("Calculator.");
break;

case(10):
System.out.print("Reminders.");
break;

case(11):
System.out.print("CLOCK MENU:");
System.out.println("1. Alarm Clock.");
System.out.println("2. Clock Settings.");
System.out.println("3. Date Setting.");
System.out.println("4. StopWatch.");
System.out.println("5. CountDown Timer.");
System.out.println("6.Auto update Date And time.");
System.out.println("Enter their number to access them: ");
int clockChoice= input.nextInt();
while(clockChoice <1 || clockChoice > 6){
System.out.println("INVALID NUMBER!!!\nEnter their number to access them: ");
clockChoice = input.nextInt();
}
switch(clockChoice){
case(1):
System.out.println("ALARM CLOCK: ");
break;
case(2):
System.out.println("CLOCK SETTINGS: ");
break;
case(3):
System.out.println("DATE SETTING: ");
break;
case(4):
System.out.println("STOPWATCH: ");
break;
case(5):
System.out.println("COUNTDOWN TIMER: ");
break;
case(6):
System.out.println("AUTO UPDATE DATE AND TIME: ");
break;

}
break;

case(12):
System.out.print("Profiles.");
break;

case(13):
System.out.print("SIM Services.");
break;

}
}
}
