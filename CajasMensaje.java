
package Vista;

import javax.swing.JOptionPane;

public class CajasMensaje {
 String titulo;

    public CajasMensaje(String titulo) {
        this.titulo = titulo;
    }

    public CajasMensaje() {
      this.titulo=" ";  
    }
    public int LeerEntero(String msg){
        int val;
        val=Integer.parseInt(JOptionPane.showInputDialog(null,
                msg,titulo,JOptionPane.INFORMATION_MESSAGE));
    return val;
    }
    public double LeerDecimal(String msg){
        double val;
        val=Double.parseDouble(JOptionPane.showInputDialog(null,
                msg,titulo,1));
        return val;
    }
    public String leerTexto(String msg){
        return JOptionPane.showInputDialog(null,msg,titulo,1);
    }
    public void Mostrar(String msg){
        JOptionPane.showMessageDialog(null, msg,titulo,1);
    }
    public boolean confirmar(String msg){
     int resp=JOptionPane.showConfirmDialog(null, msg,titulo,
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (resp==JOptionPane.YES_OPTION){
            return true;
        }     
        else
            return false;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}

 