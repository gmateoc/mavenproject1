package com.mycompany.mavenproject1;

public class Mavenproject1 {
    
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Mi coche tiene "+miCoche.puerta+" puerta(s)");
    }
}

class Coche{
    public int puerta = 0;
    
    public void AgregarPuerta(){
        this.puerta++;
    }
}