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
public class Autobus extends Vehiculo{
    private int pasajeros,ejes;
    private double longitud;

    public Autobus(String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
    }

    

    public Autobus(int pasajeros, int ejes, double longitud, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.pasajeros = pasajeros;
        this.ejes = ejes;
        this.longitud = longitud;
    }

    

    

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
}
