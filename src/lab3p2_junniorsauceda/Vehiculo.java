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
public class Vehiculo {
    private String placa,marca,modelo,tipo;
    private Color color;
    private Date ano=new Date();

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, String tipo, Color color, Date año) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.ano = año;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return ano;
    }

    public void setAño(Date año) {
        this.ano = año;
    }

    @Override
    public String toString() {
        return ": " + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", ano=" + ano.getYear() + '}';
    }
    
    
}
