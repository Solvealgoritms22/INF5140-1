package prueba;  //<--- se debe crear un directorio para que esto funcione
import java.util.Scanner;
public class AgeChecker {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int age;
System.out.print("Please enter your age: ");
age = in.nextInt();
if(age > 20)
System.out.println("You are an adult");
else
System.out.println("You are not an adult");
//endif
in.close();
}//end method main
}//end class AgeChecker
