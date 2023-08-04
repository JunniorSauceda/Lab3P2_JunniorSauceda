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
                            System.out.println((lista.indexOf(vehiculo)+1)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
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
                            System.out.println((lista.indexOf(vehiculo)+1)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
                        }
                        System.out.println("Ingrese el indice del vehiculo que desea eliminar: ");
                        int indice=scs.nextInt();
                        while(indice<1||indice>lista.size()){
                            System.out.println("Ingrese un indice valido: ");
                             indice=scs.nextInt();
                        }
                        lista.remove(indice-1);
                        JOptionPane.showMessageDialog(null, "Se ha ELIMINADO el vehiculo");
                    }
                }
                break;
                case 6:{
                    if(lista.isEmpty()){
                        System.out.println("No hay vehiculos para enlistar");
                    }
                    else{
                        int A=0,M=0,B=0;
                        for (Vehiculo vehiculo : lista) {
                            if(vehiculo instanceof Automovil){
                                A++;
                            }
                            if(vehiculo instanceof Motocicleta){
                                M++;
                            }
                            if(vehiculo instanceof Autobus){
                                B++;
                            }
                            
                        }
                        System.out.println("LISTA TOTAL DE VEHICULOS");
                        
                        int cont=1;
                        System.out.println("El total de vehiculos es: "+A);
                        System.out.println("");
                        System.out.println("Automoviles:");
                        for (Vehiculo vehiculo : lista) {
                            if(vehiculo instanceof Automovil){
                                System.out.println((cont)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
                                cont++;
                            }
                        }
                        cont=1;
                        System.out.println("El total de motocicletas es: "+M);
                        System.out.println("");
                        System.out.println("Motocicletas");
                        for (Vehiculo vehiculo : lista) {
                            if(vehiculo instanceof Motocicleta){
                                System.out.println((cont)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
                                cont++;
                            }
                        }
                        cont=1;
                        System.out.println("");
                        System.out.println("El total de autobuses es: "+B);
                        System.out.println("");
                        System.out.println("Autobuses");
                        for (Vehiculo vehiculo : lista) {
                            if(vehiculo instanceof Autobus){
                                System.out.println((cont)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
                                cont++;
                            }
                        }
                    }
                }
                break;
                case 7:{
                    if(lista.isEmpty()){
                        System.out.println("No hay vehiculos");
                    }
                    else{
                        for (Vehiculo vehiculo : lista) {
                            System.out.println((lista.indexOf(vehiculo)+1)+".- "+" "+vehiculo.getClass().getSimpleName()+" "+vehiculo);
                        }
                        System.out.println("Ingrese el indice del vehiculo que al que desea ponerle una boleta ");
                        int indice=scs.nextInt();
                        while(indice<1||indice>lista.size()){
                            System.out.println("Ingrese un indice valido: ");
                             indice=scs.nextInt();
                        }
                        System.out.println("");
                        System.out.println("BOLETA DE REVISION VEHICULAR");
                        System.out.println("Placa: "+lista.get(indice-1).getPlaca());
                        System.out.println("Marca: "+lista.get(indice-1).getMarca());
                        System.out.println("Modelo: "+lista.get(indice-1).getModelo());
                        System.out.println("Tipo: "+lista.get(indice-1).getTipo());
                        System.out.println("Color: "+lista.get(indice-1).getColor());
                        System.out.println("Año: "+lista.get(indice-1).getAño().getYear());
                        double paga=525;
                        if(lista.get(indice-1) instanceof Automovil){
                            paga+=1200;
                        }
                        else if(lista.get(indice-1) instanceof Autobus){
                            paga+=1000;
                        }
                        else if(lista.get(indice-1) instanceof Motocicleta){
                            paga+=200;
                        }
                        System.out.println("El total de su Boleta es: "+paga);
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
        String placa,modelo,marca,tipoV="",tipocomb="",tipotrans="";
        int asientos,ano,puertas ;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaAuto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
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
        System.out.println("""
                           Seleccione el tipo de combustible:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
        
        String Comb = sc.nextLine();
        while (num(Comb)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
            Comb = sc.nextLine();
        }
        int gaso = 0;
        gaso = Integer.parseInt(Comb);
        while (gaso < 1 || gaso > 3) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
            Comb = sc.nextLine();
            while (num(Comb)) {
                System.out.println("""
                           Seleccione el tipo de combustible:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
                Comb = sc.nextLine();
            }
            gaso = 0;
            gaso = Integer.parseInt(Comb);
        }
        switch(gaso){
            case 1:{
                tipocomb="Diesel";
            }
            break;
            case 2:{
                tipocomb="Super";
            }
            break;
            case 3:{
                tipocomb="Regular";
            }
            break;
        }
        System.out.println("Ingrese el numero de puertas: ");
        puertas=scs.nextInt();
        while(puertas<0){
           System.out.println("Ingrese un numero valido: ");
            puertas=scs.nextInt(); 
        }
        System.out.println("""
                           Seleccione el tipo de transmision del vehiculo:
                           1.- Automatico
                           2.- Mecanico
                           """);
        
        String T = sc.nextLine();
        while (num(T)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Automatico
                           2.- Mecanico
                           """);
            T = sc.nextLine();
        }
        int tranformer = 0;
        tranformer = Integer.parseInt(T);
        while (tranformer < 1 || tranformer > 2) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo de transmision:
                           1.- Automatico
                           2.- Mecanico
                           """);
            T = sc.nextLine();
            while (num(T)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Automatico
                           2.- Mecanico
                           """);
                T = sc.nextLine();
            }
            tranformer = 0;
            tranformer = Integer.parseInt(T);
        }
        switch(tranformer){
            case 1:{
                tipotrans="Automatico";
            }
            break;
            case 2:{
                tipotrans="Mecanico";
            }
            break;
            case 3:{
                tipotrans="Regular";
            }
            break;
        }
        
        
        System.out.println("Ingrese el numero de asientos del automovil: ");
        asientos=scs.nextInt();
        while(asientos<1){
           System.out.println("Ingrese un numero valido: ");
            asientos=scs.nextInt(); 
        }
        
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
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaMoto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
        System.out.println("Ingrese una marca: ");
        marca=sc.nextLine();
        System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           3.- Otro
                           """);
        
        String Tipos = sc.nextLine();
        while (num(Tipos)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
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
                           2.- Cuatrimoto
                               3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                                   3.- Otro
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
            case 3:{
                tipoV="Otro";
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
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaAuto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
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
        ano=scs.nextInt();
        while(ano<1){
            System.out.println("Ingrese un año valido: ");
            ano=scs.nextInt();
        }
        Date año=new Date();
        año.setYear(ano);
        
        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
        pasajero=scs.nextInt();
        while(pasajero<1){
           System.out.println("Ingrese una cantidad valida: ");
            pasajero=scs.nextInt(); 
        }
        System.out.println("Ingrese el numero de ejes del bus: ");
        eje=scs.nextInt();
        while(eje<1){
           System.out.println("Ingrese una cantidad valida");
            eje=scs.nextInt(); 
        }
        System.out.println("Ingrese la longitud del autobus: ");
        longitud=scs.nextDouble();
        while(longitud<1){
           System.out.println("Ingrese una longitud valida: ");
            longitud=scs.nextDouble(); 
        }
        Autobus bus=(new Autobus(pasajero, eje, longitud, placa, marca, modelo, tipoV, color, año));
        return bus;
    }
    
    public static void addAutomovil(){
        String placa,modelo,marca,tipoV="",tipocomb="",tipotrans="";
        int asientos,ano,puertas ;
        Color color;
        System.out.println("A continuacion agregara un vehiculo, Porfavor ingrese los siguientes datos:");
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaAuto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
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
        while(ano<1){
          System.out.println("Ingrese un numero valido: ");
          ano=sc.nextInt();  
        }
        sc=new Scanner(System.in);
        System.out.println("""
                           Seleccione el tipo de combustible:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
        
        String Comb = sc.nextLine();
        while (num(Comb)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
            Comb = sc.nextLine();
        }
        int gaso = 0;
        gaso = Integer.parseInt(Comb);
        while (gaso < 1 || gaso > 3) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
            Comb = sc.nextLine();
            while (num(Comb)) {
                System.out.println("""
                           Seleccione el tipo de combustible:
                           1.- Diesel
                           2.- Super
                           3.- Regular
                           """);
                Comb = sc.nextLine();
            }
            gaso = 0;
            gaso = Integer.parseInt(Comb);
        }
        switch(gaso){
            case 1:{
                tipocomb="Diesel";
            }
            break;
            case 2:{
                tipocomb="Super";
            }
            break;
            case 3:{
                tipocomb="Regular";
            }
            break;
        }
        System.out.println("Ingrese el numero de puertas: ");
        puertas=scs.nextInt();
        while(puertas<1){
            System.out.println("Ingrese un numero valido: ");
            puertas=scs.nextInt();
        }
        System.out.println("""
                           Seleccione el tipo de transmision del vehiculo:
                           1.- Automatico
                           2.- Mecanico
                           """);
        
        String T = sc.nextLine();
        while (num(T)) {
            System.out.println("""
                               Solo debe ingresar numeros
                           Seleccione el tipo:
                           1.- Automatico
                           2.- Mecanico
                           """);
            T = sc.nextLine();
        }
        int tranformer = 0;
        tranformer = Integer.parseInt(T);
        while (tranformer < 1 || tranformer > 2) {
            System.out.println("""
                               Ingrese una opcion valida
                           Seleccione el tipo de transmision:
                           1.- Automatico
                           2.- Mecanico
                           """);
            T = sc.nextLine();
            while (num(T)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Automatico
                           2.- Mecanico
                           """);
                T = sc.nextLine();
            }
            tranformer = 0;
            tranformer = Integer.parseInt(T);
        }
        switch(tranformer){
            case 1:{
                tipotrans="Automatico";
            }
            break;
            case 2:{
                tipotrans="Mecanico";
            }
            break;
            case 3:{
                tipotrans="Regular";
            }
            break;
        }
        
        
        System.out.println("Ingrese el numero de asientos del automovil: ");
        asientos=scs.nextInt();
        while(asientos<1){
            System.out.println("Ingrese un numero valido: ");
            asientos=scs.nextInt();
        }
        
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
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaMoto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
        
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
                           2.- Cuatrimoto
                           3.- Otro
                           """);
            Tipos = sc.nextLine();
            while (num(Tipos)) {
                System.out.println("""
                           Seleccione el tipo:
                           1.- Normal
                           2.- Cuatrimoto
                           3.- Otro
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
            case 3:{
                tipoV="Otro";
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
        do{
            System.out.println("Ingrese la Placa: ");
            placa=sc.nextLine();
            while(verifPlacaAuto(placa)){
                System.out.println("Ingrese una placa valida");
                placa=sc.nextLine();
            }
            if(verifPlacas(placa)){
                System.out.println("La placa ingresada ya esta ingresada");
            }
            
        }while(verifPlacas(placa));
        System.out.println("Ingrese una marca: ");
        marca=sc.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo=sc.nextLine();
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
        ano=scs.nextInt();
        while(ano<1){
            System.out.println("Ingrese un año valido: ");
            ano=scs.nextInt();
        }
        Date año=new Date();
        año.setYear(ano);
        
        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
        pasajero=scs.nextInt();
        while(pasajero<1){
           System.out.println("Ingrese una cantidad valida: ");
            pasajero=scs.nextInt(); 
        }
        System.out.println("Ingrese el numero de ejes del bus: ");
        eje=scs.nextInt();
        while(eje<1){
           System.out.println("Ingrese una cantidad valida");
            eje=scs.nextInt(); 
        }
        System.out.println("Ingrese la longitud del autobus: ");
        longitud=scs.nextDouble();
        while(longitud<1){
           System.out.println("Ingrese una longitud valida: ");
            longitud=scs.nextDouble(); 
        }
        lista.add(new Autobus(pasajero, eje, longitud, placa, marca, modelo, tipoV, color, año));
        JOptionPane.showMessageDialog(null, "Se ha agregado el bus a la lista");
        
        
        
         
    }
    public static boolean verifPlacas(String placa){
        boolean plac=false;
        int cont=0;
        for (Vehiculo vehiculo : lista) {
            if(vehiculo.getPlaca().equals(placa)){
                cont++;
            }
        }
        if(cont>0){
            plac=true;
        }
        return plac;
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
