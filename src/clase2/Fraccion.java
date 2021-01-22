package clase2;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion convertirAFraccion(int entero){
        return new Fraccion(entero, 1);
    }

    public Fraccion multiplicar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion(getNumerador(), getDenominador());

        nuevaFraccion.setNumerador(this.numerador * otraFraccion.getNumerador());
        nuevaFraccion.setDenominador(this.denominador * otraFraccion.getDenominador());

        return nuevaFraccion;
    }

    public Fraccion multiplicar(int entero){
        Fraccion otraFraccion = convertirAFraccion(entero);

        return multiplicar(otraFraccion);
    }

    public Fraccion dividir(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion(getNumerador(), getDenominador());

        nuevaFraccion.setNumerador(this.numerador * otraFraccion.getDenominador());
        nuevaFraccion.setDenominador(this.denominador * otraFraccion.getNumerador());

        return nuevaFraccion;
    }

    public Fraccion dividir(int entero){
        Fraccion otraFraccion = convertirAFraccion(entero);

        return dividir(otraFraccion);
    }

    public Fraccion sumar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion(getNumerador(), getDenominador());

        nuevaFraccion.setDenominador(this.denominador * otraFraccion.getDenominador());
        nuevaFraccion.setNumerador(
                                    this.denominador * otraFraccion.getNumerador() +
                                    this.numerador * otraFraccion.getDenominador()
                                );

        return nuevaFraccion;
    }

    public Fraccion sumar(int entero){
        Fraccion otraFraccion = convertirAFraccion(entero);

        return sumar(otraFraccion);
    }

    public Fraccion restar(Fraccion otraFraccion){
        Fraccion nuevaFraccion = new Fraccion(getNumerador(), getDenominador());

        nuevaFraccion.setDenominador(this.denominador * otraFraccion.getDenominador());
        nuevaFraccion.setNumerador(
                                    this.denominador * otraFraccion.getNumerador() -
                                    this.numerador * otraFraccion.getDenominador()
                                );

        return nuevaFraccion;
    }

    public Fraccion restar(int entero){
        Fraccion otraFraccion = convertirAFraccion(entero);

        return restar(otraFraccion);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
