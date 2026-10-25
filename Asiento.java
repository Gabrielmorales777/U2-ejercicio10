public class Asiento {
    private int Numero;
    private String Clase;
    private boolean Ocupado;


    public Asiento(int numero, String clase) {
        this.Numero = numero;
        this.Clase = clase;
        this.Ocupado = false;
    }
    public int getNumero(){
        return Numero;
    }
    public String getClase(){
        return Clase;
    }
    public boolean isOcupado() {
        return Ocupado;
    }
    public void ocupar(){
        Ocupado = true;
    }

}
