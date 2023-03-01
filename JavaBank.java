import java.util.*;

public class JavaBank {
    public static void main(String[] args) {
        System.out.println("\nBienvenido al Banco Java!");

        // Inicializar cuentas bancarias y clientes
		Account a1 = new Account("1111", 1000.00);
		Account a2 = new Account("2222", 500.00);
		Customer c1 = new Customer("Darling", "Fajardo", a1);
        Customer c2 = new Customer("Joel", "Encarnacion", a2); 
        
        // Imprimir saldos iniciales
        System.out.println("\nSaldos iniciales para Darling Fajardo: " + c1.getAccount().getBalance());
        System.out.println("Saldos iniciales para Joel Encarnacion: " + c2.getAccount().getBalance());
        
        // Cree un objeto Scanner para tomar la entrada del usuario 
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una cantidad para depositar
        System.out.print("\nIntroduce una cantidad a depositar: ");
        double amount = sc.nextDouble();
        
        // Depositar el importe en cada cuenta
        a1.deposit(amount);
        a2.deposit(amount);
        
        // Imprimir los saldos de cuenta actualizados
        System.out.println("\nSaldo actualizado para Darling Fajardo: " + c1.getAccount().getBalance());
        System.out.println("Saldo actualizado para Joel Encarnacion: " + c2.getAccount().getBalance());
    }
}

// Clases y metodos
class Account {
    private String number;
    private double balance;
    
    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    
    public Customer(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
}