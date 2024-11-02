package Class;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edu
 */
public class Matricula {
    private String tipoPago;
    private String deporte;
    private int documemnto; // Numero de documento de indentidad
    private boolean descuento = false;
    
    public Matricula(){
        
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getDocumemnto() {
        return documemnto;
    }

    public void setDocumemnto(int documemnto) {
        this.documemnto = documemnto;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    
}
