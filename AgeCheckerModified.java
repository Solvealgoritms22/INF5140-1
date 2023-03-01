package agechecker;

import java.util.Scanner;

public class AgeCheckerModified {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int age;
int teens = 10;
System.out.print("\nPor favor, introduzca su edad: ");
age = in.nextInt();
System.out.println("\n\nResultado:");
if(age > 20)
System.out.println("Eres un adulto");
else if (age >= teens && age <= 19)
System.out.println("Eres un adolescente");
else if (age < teens)
System.out.println("Eres un niño");
else 
System.out.println("No eres un adulto");

//----------------------------Nuevas funcionalidades------------------------------
if(age >= 65)
System.out.println("Eres una persona de la tercera edad");
if(age % 2 == 0)
System.out.println("Tu edad es par");
if (age % 2 != 0)
System.out.println("Tu edad es rara");
if (age > 65 && age % 2 != 0)
System.out.println("Eres una persona mayor y tu edad es impar.");
if (age < 12 && age % 2 == 0)
System.out.println("Eres un niño pequeño y tu edad es incluso");
if (age < 12 && age % 2 != 0)
System.out.println("Eres un niño pequeño y tu edad es extraña");

//endif
in.close();
}//end method main
}//end class AgeChecker