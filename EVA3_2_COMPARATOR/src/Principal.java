
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LinkedList <String>nuevo = new <String>LinkedList();
       nuevo.add("hola");
       nuevo.add("amigos");
       nuevo.add("escuchenme");
       nuevo.add("a");
       nuevo.add("mi");
       Comparator comperstr = new Comparator(){
           @Override
           public int compare(Object o1, Object o2) {
               char resu;
                String cade1 = (String) o1;
               String cade2 = (String) o2;
                resu = o1 - o2;
                return resu;
                
                
                
           }
       };
    }
    
}
