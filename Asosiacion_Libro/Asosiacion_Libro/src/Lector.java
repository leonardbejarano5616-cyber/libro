public class Lector {
    private Libro libroActual;
    private String nombre;
    private String cedula;
    public Lector(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public Libro getLibroActual() {
        return this.libroActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void tomarPrestado(Libro libro){
        if(libroActual != null){
            System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo() + "\". debe devolver primero.");
        }else{
            
        }

    }
}
    

