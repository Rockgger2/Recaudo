package Control;

import Modelo.Auto;
import Modelo.Moto;
import Modelo.Persona;
import Vista.CajasMensaje;
import Modelo.Recaudo;
import Modelo.Vehiculo;

public class Controlador {

    CajasMensaje objCm;
    Recaudo objR;

    public Controlador(CajasMensaje objCm, Recaudo objR) {
        this.objCm = objCm;
        this.objR = objR;
    }

    public Controlador() {
        this.objCm = new CajasMensaje();
        this.objR = new Recaudo();
    }

    public void Iniciar() {
        objCm.setTitulo("Recaudo Impuestos");
        do {
            int tipo = objCm.LeerEntero("Vehiculos \n"
                    + "1.Auto \n 2.Moto\n Digite opcion");
            Persona objcP = new Persona();
            objcP.setId(objCm.leerTexto("Identificacion: "));
            objcP.setNom(objCm.leerTexto("Nombre: "));
            objcP.setTel(objCm.leerTexto("Telefono: "));
            switch (tipo) {
                case 1:
                    Vehiculo objA = new Auto();//POLIMORFISMO Auto a Vehiculo
                    objA.setProp(objcP);
                    objA.setPlaca(objCm.leerTexto("placa:"));
                    objA.setMarca(objCm.leerTexto("marca:"));
                    objA.setModelo(objCm.LeerEntero("modelo:"));
                    objA.setCilind(objCm.LeerEntero("cilindraje: "));
                    objA.setValor(objCm.LeerDecimal("valor:"));
                    objR.getListaV().add(objA);//Polimorfismo 
                    objCm.Mostrar("Datos registrados:" + objA.toString()
                            + "\nValor impuesto: " + objA.impuesto());
                    break;
                case 2:
                    Moto objM = new Moto();
                    objM.setProp(objcP);
                    objM.setPlaca(objCm.leerTexto("placa:"));
                    objM.setMarca(objCm.leerTexto("marca:"));
                    objM.setModelo(objCm.LeerEntero("modelo:"));
                    objM.setCilind(objCm.LeerEntero("cilindraje: "));
                    objM.setValor(objCm.LeerDecimal("valor:"));
                    objR.getListaV().add(objM);
                    objCm.Mostrar("Datos registrados:" + objM.toString()
                            + "\nValor impuesto: " + objM.impuesto());
                    break;

                default:
                    if (tipo != 1 && tipo != 2) {
                        objCm.Mostrar("Opcion erronea,vuelva a intentarlo");
                    }
            }
        } while (objCm.confirmar("Desea registrar otro vehiculo?"));
        objCm.Mostrar(objR.toString() + "\nTotal Recaudo:" + objR.TotalRecaudo());
    }

}
