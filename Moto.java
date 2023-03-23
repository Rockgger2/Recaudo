
package Modelo;


public class Moto extends Vehiculo{
    public Moto(Persona prop,String placa,String marca,int modelo,int cilind,double valor){
        super(prop,placa,marca,modelo,cilind,valor);
    }
    public Moto(){
        super();
    }
    
    public double impuesto(){
        double imp=0;
        if (cilind>125){
            imp=valor*0.015;
        }
        return imp;   
    }

}
