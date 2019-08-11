/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10082019_07;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rivera
 */
public class CalcularEstacion {
    private int mes;
    private int dia;
    private String estacion;
    
    public CalcularEstacion(){
    
        
    }
    
    public void calcularEstacion(int mes, int dia)
    {
           this.mes = mes;
        this.dia = dia;
        
        if(mes == 3 && dia >= 21){
           estacion = "PRIMAVERA";
        }else if(mes == 4 && dia <= 30)
        {
            estacion = "PRIMAVERA";
        }else if(mes == 5 && dia <= 31){
            estacion = "PRIMAVERA";
        }else if(mes == 6 && dia <= 20){
            estacion = "PRIMAVERA";
        }else if(mes == 6 && dia >= 21){
            estacion = "VERANO";
        }else if(mes == 7 && dia <= 31){
            estacion = "VERANO";
        }else if(mes == 8 && dia <= 31 ){
            estacion = "VERANO";
        }else if(mes == 9 && dia <= 20){
            estacion = "VERANO";
        }else if(mes == 9 && dia >= 21){
            estacion = "OTOÑO";
        }else if(mes == 10 && dia <= 31){
            estacion = "OTONO";
        }else if(mes == 11 & dia <= 30){
            estacion = "OTOÑO";
        }else if(mes == 12 && dia <= 20){
            estacion = "OTOÑO";
        }else if(mes == 12 && dia >= 21){
            estacion = "INVIERNO";
        }else if(mes == 1 && dia <= 31){
            estacion = "INVIERNO";
        }else if(mes == 2 && dia <= 28){
            estacion = "INVIERNO";
        }else if(mes == 3 && dia <= 20){
            estacion = "INVIERNO";
        }
            
    }
    
    public String getEstacion(){
        
        return estacion;
    }
    
}
