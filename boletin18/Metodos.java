package boletin18;

import java.util.Arrays;

/**
 *
 * @author mmartinezcosta
 */
public class Metodos {

    int [] numeros= new int [6];
    
    public void crearArray(){
        
        for (int i=0 ; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*50+1);
            
        }   
    }
    public void amosar(){
        Arrays.sort(numeros);
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    public void reves(){
        Arrays.sort(numeros);
        for (int i=numeros.length - 1; i>-1; i--)
            System.out.println("******"+numeros[i]);
            }

}

