import java.util.Scanner;

public class Sistema {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String nombre= "";
        Integer clave=0;
        Integer antiguedad=0;

        System.out.println("*****************************************************");
        System.out.println("*Bienvnido al sistema vacacional de cOCAcOLA Company*");
        System.out.println("*****************************************************");
        System.out.println("");
        System.out.println("");

        System.out.print("Cual es el nombre del Trabajador: ");
        nombre= entrada.nextLine();
        System.out.println("");

        System.out.print("Cuanto tiempo se servicio tiene el trabajador: ");
        antiguedad= entrada.nextInt();
        System.out.println("");

        System.out.print("Cual es la clave del trabjador");
        clave = entrada.nextInt();
        System.out.println("");

        if(clave==1){
            if(antiguedad==1){
                System.out.println("el trabajador "+nombre + "tiene 6 dias de vacaciones");} 
                else if(antiguedad>=2 && antiguedad<=6){ 
                System.out.println("el trabajador "+nombre + "tiene 14 dias de vacaciones");}
                else if(antiguedad>=7){}
                System.out.println("el trabajador "+nombre + "tiene 20 dias de vacaciones");}
        
                
            else if(antiguedad>=2 && antiguedad<=6){ 
            System.out.println("el trabajador "+ nombre + "tiene 15 dias de vacaciones");
            }else if(antiguedad>=7){
            System.out.println("el trabajador "+nombre + "tiene 22 dias de vacaciones");}

            else if(clave==3){
            if(antiguedad==1){
                System.out.println("el trabajador "+nombre + "tiene 10 dias de vacaciones");
            }   else if(antiguedad>=2 && antiguedad<=6){ 
                System.out.println("el trabajador "+nombre + "tiene 20 dias de vacaciones");
            }   else if(antiguedad>=7){}
                System.out.println("el trabajador "+nombre + "tiene 30 dias de vacaciones");
            
            } else {
           System.out.println("ERROR, LA CLAVE DEL DEPARTAMENTO ES INCORRECTA"); 
        }
    }
}


   