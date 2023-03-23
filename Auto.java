
package Modelo;


public class Auto extends Vehiculo{

    
    
    public double impuesto() {
       double imp=0;
       if(modelo<2000){
           imp=valor*0.015;
       }
       else{
           imp=valor*0.025;
       }
       return imp;
    }

    public Auto(Persona prop, String placa, String marca, int modelo, int cilind, double valor) {
        super(prop, placa, marca, modelo, cilind, valor);
    }

    public Auto() {
        super ();
    }
    
}
