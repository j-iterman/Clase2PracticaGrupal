package clase2;

public class Contador {

    private int valor;
    private boolean direccion;

    public Contador() {
    }

    public Contador(int inicio, boolean direccion) {
        this.valor = inicio;
        this.direccion = direccion;
    }

    public Contador(Contador contador){
        this.valor = contador.getValor();
        this.direccion = contador.getDireccion();
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setDireccion(boolean direccion) {
        this.direccion = direccion;
    }

    public boolean getDireccion() {
        return direccion;
    }

    public int contar(){
        if (getDireccion()) this.valor += 1;
        else this.valor -= 1;

        return valor;
    }
}
