import java.util.Scanner; //Se debe importar libreria siempre que se requiera

public class AgeChecker_v2 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int age;
char holdLicence;

System.out.print("Please enter your age: ");
age = in.nextInt();
System.out.print("Do you hold a current drivinglicence? ");
holdLicence = in.next().charAt(0);
if(age > 20)
System.out.println("You are an adult");
else
System.out.println("You are not an adult");
//endif
in.close();

  }//end method main
}//end class AgeChecker