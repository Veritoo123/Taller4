package inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
protected int numeroBaños;

public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int númeroHabitaciones, int númeroBaños) {
super(identificadorInmobiliario, area, direccion); 
this.numeroHabitaciones = númeroHabitaciones;
this.numeroBaños = númeroBaños;
}

void imprimir() {
super.imprimir();
System.out.println("Numero de habitaciones = " + numeroHabitaciones);
System.out.println("Numero de baños = " + numeroBaños);
}
    
}
