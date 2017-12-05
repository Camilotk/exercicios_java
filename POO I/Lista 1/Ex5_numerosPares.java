package Lista_1;
import java.util.ArrayList;
public class Ex5_numerosPares {
    private static boolean verificaPar (int a){
        if (a%2==0){
            return true;
        } else {
            return false;
        }
    }
    private static void imprime (int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = new ArrayList();
        for (int j = 1; j<1000; j++) {
            if (verificaPar(j)){
                numerosPares.add(j);
            }
        }
        for (int j = 0; j < numerosPares.size(); j++){
            imprime(numerosPares.get(j));
        }
    }
}
