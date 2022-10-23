package ejercicio1_act4_herencia;

//Esta es una clase hija (Cuenta de ahorros) que hereda de la clase madre (Cuenta)
public class CuentaAhorros extends Cuenta {

    protected boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comision += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000) {
            activa = false;
        }
    }
    
    public void imprimir() {
System.out.println("El saldo es de $ " + saldo);
System.out.println("La comision mensual es de $ " + comision);
System.out.println("Se hicieron " +(numeroConsignaciones + numeroRetiros) + " transacciones");
System.out.println(); 
}
}
