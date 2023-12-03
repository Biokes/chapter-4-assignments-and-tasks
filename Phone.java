import java.util.Scanner;
public class Phone{
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
System.out.print("DISPLAY MENU->(Enter their number to access them!!!):");

int menu = input.nextInt();
while( menu <1 || menu >13){
System.out.print("DISPLAY MENU->(Enter their number to access them!!!):");
menu = input.nextInt();
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
}


if(menu == 1){
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

if(phoneBookChoice==1){System.out.println("Search: ");}
if(phoneBookChoice==2){System.out.println("Service Nos: ");}
if(phoneBookChoice==3){System.out.println("Add Name: ");}
if(phoneBookChoice==4){System.out.println("Erase: ");}
if(phoneBookChoice==5){System.out.println("Edit: ");}
if(phoneBookChoice==6){System.out.println("Assign Tone: ");}
if(phoneBookChoice==7){System.out.println("Spend B' Card: ");}
if(phoneBookChoice==8){System.out.println("OPTIONS MENU:\nEnter their Number to Access them: ");
System.out.println("1. Type of View.\n2. Memory Status");
int options= input.nextInt();
while(options <1 || options >2){
System.out.println("INVALID NUMBER!!!\nOPTIONS MENU:\nEnter their Number to Access them: ");
options = input.nextInt();}
if(options == 1){System.out.print("Type of view:");}
if(options == 2){System.out.print("Memory Status:");}
}
if(phoneBookChoice==9){System.out.println("Speed Dials: ");}
if(phoneBookChoice==10){System.out.println("Voice Tags: ");}
}

if(menu ==2 ){
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
if(messagesChoice ==1){System.out.print("Write Messages: ");}
if(messagesChoice ==2){System.out.print("Inbox: ");}
if(messagesChoice ==3){System.out.print("Outbox: ");}
if(messagesChoice ==4){System.out.print("Picture Messages: ");}
if(messagesChoice ==5){System.out.print("Templates: ");}
if(messagesChoice ==6){System.out.print("Smiley: ");}
if(messagesChoice ==7){System.out.print("Messages Settings menu: ");
System.out.println("1. Set.\n2. Common.\n");
System.out.println("MESSAGES SETTING MENU:->(Enter the Mesages menu number to Access Them.)");
int messagesSetting = input.nextInt();
while(messagesSetting <1 || messagesSetting>2){System.out.println("INVALID NUMBER!!!\nMessages Setting Menu:->(Enter the Mesages menu number to Access Them.)");
messagesSetting = input.nextInt();}
if(messagesSetting == 1){System.out.println("SET MENU:\n1. Message center number.\n2.Message sent as.\n3. Message Validity");}
if(messagesSetting == 2){System.out.println("COMMON MENU:\n1. Message center number.\n2.Message sent as.\n3. Message Validity");}
}
if(messagesChoice ==8){System.out.print("Info Services: ");}
if(messagesChoice ==9){System.out.print("Voice Mailbox number: ");}
if(messagesChoice ==10){System.out.print("Service Command Editor: ");}
}
if(menu == 3){System.out.println("CHAT MENU: ");}

if(menu == 4){System.out.println("CALL REGISTER MENU: ");
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
while(callRegister <1 || callRegister>8){System.out.println("INVALID NUMBER!!!\nCALL REGISTER MENU:->(Enter the Mesages menu number to Access Them.)");
callRegister = input.nextInt();
}

if(callRegister ==1){System.out.print("Missed Calls: ");}
if(callRegister ==2){System.out.print("Recieved Calls: ");}
if(callRegister ==3){System.out.print("Dialed Calls: ");}
if(callRegister ==4){System.out.print("Erase Recent call list: ");}

if(callRegister ==5){
System.out.println("SHOW CALL DURATION MENU:\n1. Last call duration.\n2. All calls duration\n3. Recieved calls Duration .\n4.Dailled calls counters.\n 5. Clear Timers.");
System.out.println("Enter their number to Access them: ");
int callDuration = input.nextInt();
while(callDuration <1 || callDuration > 5){System.out.println("INVALID NUMBER!!!\nSHOW CALL DURATION MENU:->(Enter the Mesages menu number to Access Them.)");
callDuration = input.nextInt();}
if(callDuration==1){System.out.print("Last call Duration: ");}
if(callDuration==2){System.out.print("All calls duration: ");}
if(callDuration==3){System.out.print("Recieved calls Duration: ");}
if(callDuration==4){System.out.print("Dailled calls counters: ");}
if(callDuration==5){System.out.print("Clear Timers: ");}
}

if(callRegister ==6){System.out.print("SHOW CALL COSTS MENU:\n1. Last call cost.\n2. All calls' cost.\n3. Clear counters.");
System.out.println("Enter their number to Access them: ");
int callCost = input.nextInt();
while(callCost <1 || callCost > 3){System.out.println("INVALID NUMBER!!!\nSHOW CALL COSTS MENU:->(Enter the Mesages menu number to Access Them.)");
callCost = input.nextInt();}
if(callCost ==1 ){System.out.println("Last call cost: ");}
if(callCost ==2 ){System.out.println("All calls cost: ");}
if(callCost ==3 ){System.out.println("Clear Counter: ");}

 }
if(callRegister ==7){System.out.print("CALL COST SETTING MENU:\n1. Call cost Limit.\n2. Show cost in.\nEnter their number to Access them:  ");
System.out.println("Enter their number to Access them: ");
int callCosts = input.nextInt();
while(callCosts <1 || callCosts > 3){System.out.println("INVALID NUMBER!!!\nSHOW CALL COSTS MENU:->(Enter the Mesages menu number to Access Them.)");
callCosts = input.nextInt();}
if(callCosts ==1 ){System.out.println("Last call cost: ");}
if(callCosts ==2 ){System.out.println("Show cost in: ");}

}
if(callRegister ==8){System.out.print("Prepaid Credit: ");}
}
if(menu ==5){
System.out.print("TONES MENU:\n1. Ringing tone.\n2. Ringing Volume.\n3. Incoming Call Alert.\n4. Composer\n5. Message Alert Tone.\n6. KeypadTones.\n7. Warning and game Tones.\n8. Vibrating Alert.\n9. Screen Saver. ");
System.out.println("TONES MENU:->(Enter the Tone menu number to Access Them.)");
int tone = input.nextInt();
while(tone <1 || tone>9){System.out.println("INVALID NUMBER!!!\nTONE MENU:->(Enter the Mesages menu number to Access Them.)");
tone = input.nextInt();
}
if(tone ==1){System.out.println("Ring tone:");}
if(tone ==2){System.out.println("Ringing Volume:");}
if(tone ==3){System.out.println("Incoming call Alert:");}
if(tone ==4){System.out.println("Composer:");}
if(tone ==5){System.out.println("Message Alert Tone:");}
if(tone ==6){System.out.println("Keypad Tones:");}
if(tone ==7){System.out.println("Warning and game settings:");}
if(tone ==8){System.out.println("Vibrating Alert:");}
if(tone ==9){System.out.println("Screen Saver:");}
}
if(menu == 6){
System.out.print("SETTING MENU:\n1. Call Settings.\n2. Phone Setting.\n3. Security Setting.\n4. Restore Factory Setting. ");
System.out.println("SETTING MENU:->(Enter the Setting menu number to Access Them.)");
int setting = input.nextInt();
while(setting <1 || setting >4){System.out.println("INVALID NUMBER!!!\nSETTING MENU:->(Enter the Mesages menu number to Access Them.)");
setting = input.nextInt();
}
if(setting ==1){System.out.println(" CALL SETTING MENU:\n1. Automatic redial.\n2. Speed Dialing\n3. Call waiting Options.\n4. Own number Sending.\n5. Phone number in use.\n6. Automatic Answer. ");
System.out.println("CALL SETTING MENU:->(Enter the Setting menu number to Access Them.)");
int callSetting = input.nextInt();
while(callSetting <1 || callSetting >6){System.out.println("INVALID NUMBER!!!\nCALL SETTING MENU:->(Enter the Mesages menu number to Access Them.)");
callSetting = input.nextInt();
}
if(callSetting == 1){System.out.println("Automatic Redial:");}
if(callSetting == 2){System.out.println("Speed Dialing:");}
if(callSetting == 3){System.out.println("Call waiting Options:");}
if(callSetting == 4){System.out.println("Own Number Sending:");}
if(callSetting == 5){System.out.println("Phone Number in use:");}
if(callSetting == 6){System.out.println("Automatic Answer:");}
}
if(setting ==2){System.out.println("PHONE SETTING MENU:\n1.Language.\n2. Cell info Display.\n3. Welcome Note.\n4. Network Selection.\n5. Lights.\n6. Automatic Answer.");
}
if(setting ==3){System.out.println("SECURITY SETTING MENU:\n1.PIN code request.\n2. Call Barring Service.\n3. Fixed dialling.\n4. Closed User Group.\n5. Phone Security.\n6. Change Access Codes.");
}
if(setting ==4){System.out.println("RESTORE fACTORY SETTING:");}
}
if(menu == 7){System.out.print("CALL DIVERT.");}
if(menu == 8){System.out.print("GAMES.");}
if(menu == 9){System.out.print("Calculator.");}
if(menu == 10){System.out.print("Reminders.");}
if(menu == 11){System.out.print("CLOCK.\n1. Alarm Clock.\n2. Clock Settings.\n3. Date Setting\n4. StopWatch.\n 5. CountDown Timer.\n6.Auto update DAte And time.");
}
if(menu == 12){System.out.print("Profiles.");}
if(menu == 13){System.out.print("SIM Services.");}




}
}