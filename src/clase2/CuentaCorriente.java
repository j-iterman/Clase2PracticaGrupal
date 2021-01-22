package clase2;

public class CuentaCorriente {

    private int numeroCuenta;
    private double saldo;
    private String nombrePropietario;

    public CuentaCorriente() {

    }

    public CuentaCorriente(int numeroCuenta, double saldo, String nombrePropietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombrePropietario = nombrePropietario;
    }

    public CuentaCorriente(CuentaCorriente cuenta){
        this.numeroCuenta = cuenta.getNumeroCuenta();
        this.saldo = cuenta.getSaldo();
        this.nombrePropietario = cuenta.getNombrePropietario();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void ingreso(double monto){
        this.saldo += monto;
    }

    public void egreso(double monto){
        this.saldo -= monto;
    }

    public void reintegro(double monto){
        ingreso(monto);
    }

    public void transferencia(double monto, CuentaCorriente otraCuenta){
        egreso(monto);
        otraCuenta.ingreso(monto);
    }

}
