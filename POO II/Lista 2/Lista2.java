package lista.pkg2;
import java.util.LinkedList;
import java.util.Random;

/**
* <h1>Sorting Algorithm</h1>
* The program implements an application that
* sorts a list using the Insertion Sort method on a
* Linked List and shows the output on the screen.
*
* @author  Camilo Cunha
* @version 1.0
* @since   2018-05-22
*/
public class Lista2 {
    /**
     * <h2>insertion_sort</h2>
     * Recieves a list A and sort it's elements in 
     * ascending order by value of the element
     * 
     * @param list
     */
    
    public static void insertion_sort(LinkedList<Integer> list) {
        int j;
        int chave;
        int i = 0;
        
        for (j = 1; j < list.size(); j++) {
            //sets the interation value on key
            chave = list.get(j);
            //sets the i index equal the j index less one
            i = j - 1;
            //goes through every number left j and if if the left number
            //is higher than j switch it
            while ((i >= 0) && (list.get(i) > chave)) {
                list.set(i + 1, list.get(i));
                i--;
            }
            //puts key in place
            list.set(i + 1, chave);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList elementos = new LinkedList<>();
        Random n = new Random();
        for (int i = 0; i < 1000; i++) {
            elementos.add(n.nextInt(20000));
        }
        long tempoInicial = System.currentTimeMillis();
        insertion_sort(elementos);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
        for (int j = 0; j < elementos.size(); j++) {
            System.out.println(elementos.get(j));
        }
    }
    
}
