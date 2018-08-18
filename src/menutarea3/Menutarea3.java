/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menutarea3;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Menutarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        while(op<5){
           int opcion;// para seleccionar una opcion
           System.err.println("MENU");// menu de opciones
           System.out.println("1.USUARIOS");
           System.out.println("2.CONTADOR DE DIGITOS REPETIDOS");
           System.out.println("3.TRES NUMEROS DE MAYOR A MENOR");
           System.out.println("4.CALCULAR PROMEDIO");
           System.out.println("5.SALIR");
           System.out.println("INGRESE NUMERO DE OPCION:");
       
          Scanner a = new Scanner (System.in);
          opcion= a.nextInt();
        
        // el do es para que se repita el menu 
         
           if(opcion==1){
           USUARIOS obj=new USUARIOS();
            obj.menuusuarios(); // para llamar al otro menu
           }
        
           if(opcion==2){
            numerosrepetidos obj=new numerosrepetidos();
            obj.numr(); // para llamar al otro menu
           }
        
          if(opcion==3){
           MAYORAMENOR obj=new MAYORAMENOR();
            obj.maramer(); // para llamar al otro menu 
          }
        
          if(opcion==4){
            PROMEDIO obj=new PROMEDIO();
            obj.promediousers(); // para llamar al otro menu
          }
        
         if(opcion==5){
            System.err.println("GRACIAS POR UTILIZAR EL MENU :)");
         }
        opcion=op;
      };// el ciclo se repite si las opciones entre 0 y 4, 5 sale
        
    
  } 
}
