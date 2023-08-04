/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_junniorsauceda;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Junnior Sauceda
 */
public class Automovil extends Vehiculo {
    private String comb,tipotransp;
    private int puertas,asientos;

    public Automovil(String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
    }

    public Automovil(String comb, String tipotransp, int puertas, int asientos, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.comb = comb;
        this.tipotransp = tipotransp;
        this.puertas = puertas;
        this.asientos = asientos;
    }
    
    
    
    


    

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }

    public String getTipotransp() {
        return tipotransp;
    }

    public void setTipotransp(String tipotransp) {
        this.tipotransp = tipotransp;
    }

    

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    
}
