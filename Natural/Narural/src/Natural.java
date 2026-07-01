public class Natural{
    private int numero;

    public Natural(int numero){
        this.setNumero(numero);

    }
    public Natural(){
        this(0);       
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            this.numero = 0;   
        }else{
        this.numero = numero;    
        }
    }
    public void aumentar(int valor){
        this.setNumero(this.numero + valor);
    }
    
}