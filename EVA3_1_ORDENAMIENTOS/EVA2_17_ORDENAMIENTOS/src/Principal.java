/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIESPN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dats = new int[20];
        llenar(dats);
        recibir(dats);
        long ini , fin;
        ini = System.nanoTime();
        selectionSort(dats);
        fin = System.nanoTime();
        recibir(dats);
        System.out.println("Time: " + (fin - ini));
        
        llenar(dats);
        recibir(dats);
       ini = System.nanoTime();
        selectionSort(dats);
        fin = System.nanoTime();
        recibir(dats);
        System.out.println("Time: " + (fin - ini));
        
        llenar(dats);
        recibir(dats);
       ini = System.nanoTime();
        bubbleSort(dats);
        fin = System.nanoTime();
        recibir(dats);
        System.out.println("Time: " + (fin - ini));
        
    }
    
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
    public static void recibir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }
    //HACE MÁS OPERACIONES, MENOS INTERCAMBIOS
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        
    }
    //MÁS INTERCAMBIOS, MENOS OPERACIONES
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int insP;
            for (insP = 1; insP > 0 ; insP--) {
                int previo = insP - 1;
                if (array[previo] > temp) {
                    //SWAP
                    array[insP] = array [previo];  
                }
                else
                    break;   
                
            }
            array[insP] = temp;
            
        }
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j +1]) {
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j + 1] = temp;
                }
            }
        }
    
    }
    public static void quickSort(int[] array){
    int pivote, too_small, too_big;
        while(){}
    
    }
}