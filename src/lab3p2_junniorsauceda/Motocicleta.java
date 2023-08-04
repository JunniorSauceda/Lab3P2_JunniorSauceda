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
public class Motocicleta extends Vehiculo{
    private double vel,peso,cons;

    public Motocicleta(String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
    }

    

    public Motocicleta(double vel, double peso, double cons, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.vel = vel;
        this.peso = peso;
        this.cons = cons;
    }

    

    public double getVel() {
        return vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCons() {
        return cons;
    }

    public void setCons(double cons) {
        this.cons = cons;
    }
    
}
