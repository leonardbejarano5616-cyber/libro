
import com.sun.jdi.connect.Connector;

public class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this("nada","nada",0);
    }
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
        }else{
            System.out.println("ingrese una edad mayor a 0");
        }
        this.edad = edad;
    }
    public String mostrarInfo(){
        String mensaje = "La persona se llama" + this.nombre + " y su apellido es " + this.apellido + "y su edad es " + this.edad;
        return mensaje;
    }
    
    
    

    
}