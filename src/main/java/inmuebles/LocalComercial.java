
package inmuebles;

public class LocalComercial extends Local{
    protected static double valorArea= 3000000;
    protected String centroComercial;
    
    public LocalComercial( int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial){
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial= centroComercial;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("El centro comercial es= " + centroComercial);
        System.out.println();
    }
    
}
