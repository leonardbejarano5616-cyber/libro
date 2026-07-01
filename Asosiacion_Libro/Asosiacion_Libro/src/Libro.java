public class Libro{
    private String titulo;
    private String autor;
    private boolean  disponible;

    public Libro(){
        this.disponible = true;

    }
        public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
        public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public boolean isdisponible(){
        return this.disponible;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }else{
            System.out.println("el titulo esta vacio");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void mostrarinfo(String mostrarinfo){
        System.out.println("disponible: "+ (disponible ? "si" : "no"));

    }
    public boolean prestar(){
        if (disponible) {
            disponible = false;
            System.out.println("el libro \"" + titulo + "\" fue prestado.");
            return true;
        }else{
            System.out.println("el libro \"" + titulo + "\" ya esta prestado.");
            return false;
        }
    }
    public void devolver(){
        disponible = true;
        System.out.println("el libro \"" + titulo + "\" fue devuelto.");
    }
}