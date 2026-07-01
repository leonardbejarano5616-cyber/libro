public class App {
    public static void main(String[] args) throws Exception {
        Persona per1 = new Persona();
        System.out.println(per1.mostrarInfo());
        Persona per2 = new Persona();
        System.out.println(per2.mostrarInfo());

        per1.setNombre("Leonardo");
        per1.setApellido("Bejarabo");
        per1.setEdad(17);

        per2.setNombre("Steven");
        per2.setApellido("Escobar");
        per2.setEdad(20);

        System.out.println("nombre" + per1.getNombre());
        System.out.println("apellido " + per1.getApellido());
        System.out.println("edad" + per1.getEdad());
        System.out.println("nombre" + per2.getNombre());
        System.out.println("apellido " + per2.getApellido());
        System.out.println("edad" + per2.getEdad());

        System.out.println(per1.mostrarInfo());
        System.out.println(per2.mostrarInfo());

    }
}
