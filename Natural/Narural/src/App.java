public class App {
    public static void main(String[] args) throws Exception {
        Natural n1 = new Natural(5);
        Natural n2 = new Natural();
        
        System.out.println(n1.getNumero());
        System.out.println(n2.getNumero());
    
        n2.aumentar(3);
        System.out.println(n2.getNumero());

        n1.aumentar(3);
        System.out.println(n1.getNumero());
    }
}
