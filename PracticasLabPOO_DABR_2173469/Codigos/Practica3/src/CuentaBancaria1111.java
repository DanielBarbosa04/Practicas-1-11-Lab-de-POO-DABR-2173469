public class CuentaBancaria1111 {
    //atributos
    private String numeroCuenta;
    private double saldo;
    private String titular;

    //constructor
    public CuentaBancaria1111(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.setTitular(titular); // usando setter con validacion
        this.setSaldo(saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo no puede ser negativo");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Titular no puede estar vacio");
        }
    }

    // metodo toString personalizado
    @Override
    public String toString() {
        return "CuentaBancaria {" +
                "numeroCuenta ='" + numeroCuenta + '\'' +
                ", saldo= " + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}

