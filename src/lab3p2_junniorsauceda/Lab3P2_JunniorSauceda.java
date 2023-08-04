/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_junniorsauceda;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Junnior Sauceda
 */
public class Lab3P2_JunniorSauceda {
static Scanner sc=new Scanner(System.in);
static Scanner scs=new Scanner(System.in);
static ArrayList<Vehiculo> lista=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean seguir=true;
        do{
            
            System.out.println("""
                                          MENU
                               1.- Agregar Automovil
                               2.- Agregar Motocicleta
                               3.- Agregar Autobus
                               4.- Modificar Vehiculo
                               5.- Eliminar Vehiculo
                               6.- Mostrar Vehiculos
                               7.- Generar Boleta
                               8.- Salir
                                       """);
            String Opcion = sc.nextLine();
            while (num(Opcion)) {
                System.out.println("""
                                   Solo debe ingresar numeros
                                          MENU
                               1.- Agregar Automovil
                               2.- Agregar Motocicleta
                               3.- Agregar Autobus
                               4.- Modificar Vehiculo
                               5.- Eliminar Vehiculo
                               6.- Mostrar Vehiculos
                               7.- Generar Boleta
                               8.- Salir
                                       """);
                Opcion = sc.nextLine();
            }
            int opcion = 0;
            opcion = Integer.parseInt(Opcion);
            while (opcion < 1 || opcion > 8) {
                System.out.println("""
                                   Ingrese una opcion Valida
                                          MENU
                               1.- Agregar Automovil
                               2.- Agregar Motocicleta
                               3.- Agregar Autobus
                               4.- Modificar Vehiculo
                               5.- Eliminar Vehiculo
                               6.- Mostrar Vehiculos
                               7.- Generar Boleta
                               8.- Salir
                                       """);
                Opcion = sc.nextLine();
                while (num(Opcion)) {
                    System.out.println("""
                                       Solo debe ingresar numeros
                                          MENU
                               1.- Agregar Automovil
                               2.- Agregar Motocicleta
                               3.- Agregar Autobus
                               4.- Modificar Vehiculo
                               5.- Eliminar Vehiculo
                               6.- Mostrar Vehiculos
                               7.- Generar Boleta
                               8.- Salir
                                       """);
                    Opcion = sc.nextLine();
                }
                opcion = 0;
                opcion = Integer.parseInt(Opcion);
            }
            switch(opcion){
                case 1:{
                    addAutomovil();
                }
                break;
                case 2:{
                    addMoto();
                }
                break;
                case 3:{
                    addAutobus();
                }
                break;
                case 4:{

                }
                break;
                case 5:{

                }
                break;
                case 6:{

                }
                break;
                case 7:{

                }
                break;
                case 8:{
                    seguir=false;
                    System.out.println("Hasta luego");
                }
                break;
            }
        }while(seguir);
        
        
    }
    public static void addAutomovil(){
        String placa,modelo="",marca,tipoV,tipocomb,tipotrans;
        int asientos,ano,puertas ;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese la Placa: ");
        placa=sc.nextLine();
        while(verifPlacaAuto(placa)){
            System.out.println("Ingrese una placa valida");
            placa=sc.nextLine();
        }
        System.out.println("Ingrese una marca: ");
        marca=sc.nextLine();
        System.out.println("""
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
        }
        int Tip = 0;
        Tip = Integer.parseInt(Tipos);
        while (Tip < 1 || Tip > 3) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
                Tipos = sc.nextLine();
            }
            Tip = 0;
            Tip = Integer.parseInt(Tipos);
        }
        switch(Tip){
            case 1:{
                modelo="Turismo";
            }
            break;
            case 2:{
                modelo="Camioneta";
            }
            break;
            case 3:{
                modelo="Otro";
            }
            break;
        }
        color=JColorChooser.showDialog(null, 
                "Ingrese el color del Vehiculo", Color.WHITE);
        System.out.println("Ingrese el año del vehiculo: ");
        ano=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("Ingrese el tipo de combustible del Automovil: ");
        tipocomb=sc.nextLine();
        System.out.println("Ingrese el numero de puertas: ");
        puertas=scs.nextInt();
        System.out.println("Ingrese el tipo de transmision del Automovil: ");
        tipotrans=sc.nextLine();
        System.out.println("Ingrese el numero de asientos del automovil: ");
        asientos=scs.nextInt();
        
        Date año=new Date();
        año.setYear(ano);
        lista.add(new Automovil(tipocomb, tipotrans, puertas, asientos, placa, marca, modelo, Tipos, color,año ));
        JOptionPane.showMessageDialog(null, "El vehiculo se ha agregado exitosamente");
         
    }
    public static void addMoto(){
        String placa,modelo="",marca,tipoV,tipocomb;
        int asientos,ano;
        double vel,peso,consum;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese la Placa: ");
        placa=sc.nextLine();
        while(verifPlacaMoto(placa)){
            System.out.println("Ingrese una placa valida");
            placa=sc.nextLine();
        }
        System.out.println("Ingrese una marca: ");
        marca=sc.nextLine();
        System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           """);
            Tipos = sc.nextLine();
        }
        int Tip = 0;
        Tip = Integer.parseInt(Tipos);
        while (Tip < 1 || Tip > 2) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           """);
                Tipos = sc.nextLine();
            }
            Tip = 0;
            Tip = Integer.parseInt(Tipos);
        }
        switch(Tip){
            case 1:{
                modelo="Clasica";
            }
            break;
            case 2:{
                modelo="Cuatrimoto";
            }
            
            break;
        }
        color=JColorChooser.showDialog(null, 
                "Ingrese el color del Vehiculo", Color.WHITE);
        System.out.println("Ingrese el año del vehiculo: ");
        ano=scs.nextInt();
        Date año=new Date();
        año.setYear(ano);
        System.out.println("Ingrese la velocidad Maxima de la Motocicleta: ");
        vel=scs.nextDouble();
        System.out.println("Ingrese el peso de la Motocicleta: ");
        peso=scs.nextDouble();
        System.out.println("Ingrese el consumo de la motocicleta (L/Km):");
        consum=scs.nextDouble();
        lista.add(new Motocicleta(vel, peso, consum, placa, marca, modelo, Tipos, color, año));
        JOptionPane.showMessageDialog(null, "Moto agregada con exito");
        
        
         
    }
    public static void addAutobus(){
        String placa,modelo,marca,tipoV,tipocomb,tipotrans;
        int asientos,ano;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese la Placa: ");
        placa=sc.nextLine();
        while(verifPlacaAuto(placa)){
            System.out.println("Ingrese una placa valida");
            placa=sc.nextLine();
        }
        System.out.println("Ingrese una marca: ");
        marca=sc.nextLine();
        System.out.println("""
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
        }
        int Tip = 0;
        Tip = Integer.parseInt(Tipos);
        while (Tip < 1 || Tip > 3) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Turismo
                           2.- Camioneta
                           3.- Otro
                           """);
                Tipos = sc.nextLine();
            }
            Tip = 0;
            Tip = Integer.parseInt(Tipos);
        }
        switch(Tip){
            case 1:{
                tipoV="Turismo";
            }
            break;
            case 2:{
                tipoV="Camioneta";
            }
            break;
            case 3:{
                tipoV="Otro";
            }
            break;
        }
        color=JColorChooser.showDialog(null, 
                "Ingrese el color del Vehiculo", Color.WHITE);
        System.out.println("Ingrese el año del vehiculo: ");
        ano=sc.nextInt();
        
        
         
    }
    
    public static boolean verifPlacaAuto(String placa){
        boolean val=false;
        int mal=0;
        if(placa.length()>7||placa.length()<7){
            mal++;
        }
        else{
            for (int i = 0; i<placa.length(); i++) {
                char x=placa.charAt(i);
                int ascii=(int)x;
                if(i<3){
                    if(i==0&&(ascii!=72)){
                        mal++;
                    }
                    else{
                        if(ascii<65||ascii>90){
                            mal++;
                        }
                    }
                    
                }
                else{
                    if(ascii<48||ascii>57){
                        mal++;
                    }
                }
                
            }
            
        }
        if(mal>0){
            val=true;
        }
        return val;
    }
    public static boolean verifPlacaMoto(String placa){
        boolean val=false;
        int mal=0;
        if(placa.length()>7||placa.length()<7){
            mal++;
        }
        else{
            for (int i = 0; i<placa.length(); i++) {
                char x=placa.charAt(i);
                int ascii=(int)x;
                if(i<3){
                    if(i==0&&(ascii!=66)){
                        mal++;
                    }
                    else{
                        if(ascii<65||ascii>90){
                            mal++;
                        }
                    }
                    
                }
                else{
                    if(ascii<48||ascii>57){
                        mal++;
                    }
                }
                
            }
            
        }
        if(mal>0){
            val=true;
        }
        return val;
    }
    
    
    public static boolean num(String Num) {
        boolean valido = false;
        int cha = 0;
        for (int x = 0; x < Num.length(); x++) {
            char carac = Num.charAt(x);
            int ascii = carac;
            
                if (carac < 48 || carac > 57) {
                    
                    cha++;
                    
                }
            
        }
        if (cha > 0) {
            valido = true;
        }
        return valido;
    }
}
