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
public class USUARIOS {
    ///
    public void menuusuarios(){
        
        int r=0;
        String aux;
        String nombreusuario[]=new String[5];// para declarar el vector
        //variable a la q se le asigna el scanner de scn      
        Scanner scn=new Scanner(System.in);   
        
        while(r<4){
        System.out.println("MENU OPCION 1");
        System.out.println("1.INGRESAR USUARIOS");
        System.out.println("2.MOSTRAR DE FORMA ASCENDENTE");
        System.out.println("3.MOSTRAR DE FORMA DESCENDENTE");
        System.out.println("4.MENU PRINCIPAL");
        System.out.println("ingrese una opcion");
        
        Scanner a = new Scanner (System.in);
        int opcion1= a.nextInt();
       // link YOUTUBE: https://www.youtube.com/watch?v=ezB_dR5Ogws 
       //https://www.youtube.com/watch?v=hf-_c7DFb3U&t=307s
        if(opcion1==1){
            
            
            int c=0;
            for(int i=0;i<5;i++){ //for para recorrer el vector y cuando i=5 el ciclo for para 
             c++;// para ver no usuario ingresado
             System.out.println("Ingrese nombre de usuario"+c+":");
             aux=scn.next();// en aux se guarda el scanner*****
             nombreusuario[i]=aux;// este sirve para recorrer el vector
            }
        }    
       
    
        else if(opcion1==2){//para colocar de forma descendeente
            
            System.out.println("ASCENDENTE");
            for(int i=4;i>-1;i--){// SE PONE ASI YA QUE EN VEZ DE IR DE 0 A 4,  VA A IR DE 4 A 0  y cuando i=-1 el ciclo for termina
                
             System.out.println("POS "+(i+1)+":"+nombreusuario[i]);
            }
          
         
         }
        
        
        else if(opcion1==3){ // para ir mostrando los usuarios de 0 a 1
         System.out.println("DESCENDENTE");
            for(int i=0;i<nombreusuario.length;i++){
                
             System.out.println("POS "+(i+1)+":"+nombreusuario[i]);
            }
        }
        
        else if(opcion1==4){
         System.out.println("VOLVER AL MENU PRINCIPAL");
         r=4;
        }
        
     }
    
     
    }
}
