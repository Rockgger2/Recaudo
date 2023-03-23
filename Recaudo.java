
package Modelo;

import java.util.ArrayList;


public class Recaudo {
    private ArrayList<Vehiculo> ListaV;

    public Recaudo(ArrayList<Vehiculo> ListaV) {
        this.ListaV = ListaV;
    }
    public Recaudo() {
        this.ListaV = new ArrayList<Vehiculo>();
    }
public double TotalRecaudo(){
 double datos=0;
    for (int i = 0; i < ListaV.size(); i++) {
        datos+=ListaV.get(i).impuesto();
    }
    return datos;
}
    public String datosVehiculos(){
 String datos=" ";
    for (int i = 0; i < ListaV.size(); i++) {
        datos+=ListaV.get(i).toString()+"\n";
    }
    return datos;
}
    @Override
    public String toString() {
        return "Lista de Vehiculos=" +datosVehiculos();
    }

    
    public ArrayList<Vehiculo> getListaV() {
        return ListaV;
    }

    public void setListaV(ArrayList<Vehiculo> ListaV) {
        this.ListaV = ListaV;
    }
    
}
