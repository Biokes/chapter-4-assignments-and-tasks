public class Mystery2 {
public static void main(String[] args) {
 int count = 1;
while (count <= 20) {
System.out.println(count % 3 == 1 ? "########" : "++++++++");
++count; }
 int row = 5;
while (row >=5 ) {
 int column = 5;

while (column >= 5) {
System.out.print(row % 2 == 0 ? "X" : "O");
++column;
}

++row;
 System.out.println();
}
}
 }