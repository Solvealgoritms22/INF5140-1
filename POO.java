import java.util.Scanner;

public class POO {
  
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre, apellido;

        System.out.println("\nBienvenido al programa");
        System.out.println("Seleccione 1 para ingresar usuario");
        System.out.println("Seleccione 2 para ver información del usuario");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("------------------");
                System.out.print("Ingrese el nombre de usuario: ");
                nombre = scanner.next();
                System.out.print("Ingrese el apellido de usuario: ");
                apellido = scanner.next();
                usuario1.setNombre(nombre);
                usuario1.setApellido(apellido);
                System.out.println("Usuario ingresado exitosamente!");
                break;
            case 2:
                System.out.println("------------------");
                System.out.println("Información del usuario: ");
                System.out.println("Nombre: " + usuario1.getNombre());
                System.out.println("Apellido: " + usuario1.getApellido());
                break;
        }
    }
}

class Usuario {

    private String nombre;
    private String apellido;

    // getter y setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  

}