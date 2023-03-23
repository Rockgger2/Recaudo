
package Modelo;


public abstract class Vehiculo {
     protected Persona prop;//composicion agregando un objeto persona
     protected String placa,marca;
     protected int modelo,cilind;
     protected double valor;

    public Vehiculo(Persona prop, String placa, String marca, int modelo, int cilind, double valor) {
        this.prop = prop;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilind = cilind;
        this.valor = valor;
    }
    public Vehiculo() {
        this.prop = new Persona();
        this.placa =" ";
        this.marca =" ";
        this.modelo = 0;
        this.cilind = 0;
        this.valor = 0;
    }
    public abstract double impuesto();//metodo abstracto 
    
    
    @Override
    public String toString() {
        return "Vehiculo" + "Propetario=" + prop + "\n placa=" + placa + "\n Marca=" + marca +"\n Modelo=" + modelo + "\n Cilindraje=" + cilind + "\n Valor=" + valor ;
    }

    public Persona getProp() {
        return prop;
    }

    public void setProp(Persona prop) {
        this.prop = prop;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilind() {
        return cilind;
    }

    public void setCilind(int cilind) {
        this.cilind = cilind;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}

