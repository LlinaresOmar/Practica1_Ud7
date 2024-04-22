import java.util.List;

public class Profesor  extends Persona{

    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor (String nombre, int edad, String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    public Profesor (String nombre, int edad, String numeroDeTelefono, List<Prestamo> prestamos){
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        System.out.println("Liste de prestamos: ");
        for (Prestamo p: prestamos){
            System.out.println(p);
            System.out.println("------------------------");
        }
    }

}
