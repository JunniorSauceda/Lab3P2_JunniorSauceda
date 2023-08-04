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
                    if(lista.isEmpty()){
                        System.out.println("No hay vehiculos para eliminar");
                    }
                    else{
                        for (Vehiculo vehiculo : lista) {
                            System.out.println((lista.indexOf(vehiculo)+1)+".- "+" "+vehiculo);
                        }
                        System.out.println("Ingrese el indice del vehiculo que desea modificar: ");
                        int indice=scs.nextInt();
                        while(indice<1||indice>lista.size()){
                            System.out.println("Ingrese un indice valido: ");
                             indice=scs.nextInt();
                        }
                        if(lista.get(indice-1)instanceof Automovil){
                            lista.add(indice-1, modAutomovil());
                        }
                        else if(lista.get(indice-1)instanceof Motocicleta){
                            lista.add(indice-1, modMoto());
                        }
                        else if(lista.get(indice-1)instanceof Autobus){
                            lista.add(indice-1, modAutobus());
                        }
                        lista.remove(indice);
                        JOptionPane.showMessageDialog(null, "Se ha modificado el vehiculo");
                    }
                }
                break;
                case 5:{
                    if(lista.isEmpty()){
                        System.out.println("No hay vehiculos para eliminar");
                        
                    }
                    else{
                        for (Vehiculo vehiculo : lista) {
                            System.out.println((lista.indexOf(vehiculo)+1)+".- "+vehiculo.getClass()+" "+vehiculo);
                        }
                        System.out.println("Ingrese el indice del vehiculo que desea eliminar: ");
                        int indice=scs.nextInt();
                        while(indice<1||indice>lista.size()){
                            System.out.println("Ingrese un indice valido: ");
                             indice=scs.nextInt();
                        }
                        lista.remove(indice-1);
                        JOptionPane.showMessageDialog(null, "Se ha modificado el vehiculo");
                    }
                }
                break;
                case 6:{
                    if(lista.isEmpty()){
                        
                    }
                    else{
                        
                    }
                }
                break;
                case 7:{
                    if(lista.isEmpty()){
                        
                    }
                    else{
                        
                    }
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
    public static Automovil modAutomovil(){
        String placa,modelo,marca,tipoV="",tipocomb,tipotrans;
        int asientos,ano,puertas ;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese la Placa: ");
        placa=sc.nextLine();
        while(verifPlacaAuto(placa)){
            System.out.println("Ingrese una placa valida");
            placa=sc.nextLine();
        }
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
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
        Automovil auto=(new Automovil(tipocomb, tipotrans, puertas, asientos, placa, marca, modelo, tipoV, color,año ));
        
        return auto; 
    }
     public static Motocicleta modMoto(){
        String placa,modelo="",marca,tipoV="";
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
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
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
                tipoV="Clasica";
            }
            break;
            case 2:{
                tipoV="Cuatrimoto";
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
        while(vel<1){
            System.out.println("Ingrese una velocidad valida");
            System.out.println("Ingrese la velocidad Maxima de la Motocicleta: ");
            vel=scs.nextDouble();  
        }
        System.out.println("Ingrese el peso de la Motocicleta: ");
        peso=scs.nextDouble();
        while(peso<1){
            System.out.println("Ingrese un peso valido");
            System.out.println("Ingrese el peso de la Motocicleta: ");
            peso=scs.nextDouble();  
        }
        System.out.println("Ingrese el consumo de la motocicleta (L/Km):");
        consum=scs.nextDouble();
        while(consum<1){
            System.out.println("Ingrese un consumo valido");
            System.out.println("Ingrese el consumo de la Motocicleta: ");
            consum=scs.nextDouble();  
        }
        Motocicleta moto=(new Motocicleta(vel, peso, consum, placa, marca, modelo, tipoV, color, año));
        return moto; 
    }
    public static Autobus modAutobus(){
        String placa,modelo="",marca,tipoV="",tipocomb;
        int asientos,ano,pasajero,eje;
        double longitud;
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
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Normal
                           2.- Rapidito
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
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
                Tipos = sc.nextLine();
            }
            Tip = 0;
            Tip = Integer.parseInt(Tipos);
        }
        switch(Tip){
            case 1:{
                tipoV="Normal";
            }
            break;
            case 2:{
                tipoV="Rapidito";
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
        Date año=new Date();
        año.setYear(ano);
        while(ano<0){
            System.out.println("Ingrese una cantidad valida");
            ano=scs.nextInt();
        }
        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
        pasajero=scs.nextInt();
        System.out.println("Ingrese el numero de ejes del bus: ");
        eje=scs.nextInt();
        System.out.println("Ingrese la longitud del autobus: ");
        longitud=scs.nextDouble();
        Autobus bus=(new Autobus(pasajero, eje, longitud, placa, marca, modelo, tipoV, color, año));
        return bus;
    }
    
    public static void addAutomovil(){
        String placa,modelo,marca,tipoV="",tipocomb,tipotrans;
        int asientos,ano,puertas ;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese la Placa: ");
        placa=sc.nextLine();
        while(verifPlacaAuto(placa)){
            System.out.println("Ingrese una placa valida");
            placa=sc.nextLine();
        }
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
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
        lista.add(new Automovil(tipocomb, tipotrans, puertas, asientos, placa, marca, modelo, tipoV, color,año ));
        JOptionPane.showMessageDialog(null, "El vehiculo se ha agregado exitosamente");
         
    }
    public static void addMoto(){
        String placa,modelo="",marca,tipoV="";
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
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
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
                tipoV="Clasica";
            }
            break;
            case 2:{
                tipoV="Cuatrimoto";
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
        while(vel<1){
            System.out.println("Ingrese una velocidad valida");
            System.out.println("Ingrese la velocidad Maxima de la Motocicleta: ");
            vel=scs.nextDouble();  
        }
        System.out.println("Ingrese el peso de la Motocicleta: ");
        peso=scs.nextDouble();
        while(peso<1){
            System.out.println("Ingrese un peso valido");
            System.out.println("Ingrese el peso de la Motocicleta: ");
            peso=scs.nextDouble();  
        }
        System.out.println("Ingrese el consumo de la motocicleta (L/Km):");
        consum=scs.nextDouble();
        while(consum<1){
            System.out.println("Ingrese un consumo valido");
            System.out.println("Ingrese el consumo de la Motocicleta: ");
            consum=scs.nextDouble();  
        }
        lista.add(new Motocicleta(vel, peso, consum, placa, marca, modelo, tipoV, color, año));
        JOptionPane.showMessageDialog(null, "Moto agregada con exito");
        
        
         
    }
    public static void addAutobus(){
        String placa,modelo="",marca,tipoV="",tipocomb;
        int asientos,ano,pasajero,eje;
        double longitud;
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
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Normal
                           2.- Rapidito
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
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Rapidito
                           3.- Otro
                           """);
                Tipos = sc.nextLine();
            }
            Tip = 0;
            Tip = Integer.parseInt(Tipos);
        }
        switch(Tip){
            case 1:{
                tipoV="Normal";
            }
            break;
            case 2:{
                tipoV="Rapidito";
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
        Date año=new Date();
        año.setYear(ano);
        while(ano<0){
            System.out.println("Ingrese una cantidad valida");
            ano=scs.nextInt();
        }
        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
        pasajero=scs.nextInt();
        System.out.println("Ingrese el numero de ejes del bus: ");
        eje=scs.nextInt();
        System.out.println("Ingrese la longitud del autobus: ");
        longitud=scs.nextDouble();
        lista.add(new Autobus(pasajero, eje, longitud, placa, marca, modelo, tipoV, color, año));
        JOptionPane.showMessageDialog(null, "Se ha agregado el bus a la lista");
        
        
        
         
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
