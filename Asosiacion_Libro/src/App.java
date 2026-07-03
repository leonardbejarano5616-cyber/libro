public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien Años de Soledad","Gabriel Garcia Marquez");
        Lector lector1 = new Lector("Leonardo","1013268325");
        lector1.tomarPrestado(libro1);
        lector1.mostrarEstado();
    }
}
