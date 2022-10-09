//11941774, Mathias Spionjak
import java.util.HashMap;
import java.util.Map;

public class Einstiegsbeispiel {
    public static Map getRepetitions(int[] array){
        Map<Integer,Integer> zahlen = new HashMap<>();
        int i;

        if(array == null){
            throw new IllegalArgumentException("Kein Array übergeben");
        }

        if(array.length == 1){
            throw new IllegalArgumentException("Nur ein Element vorhanden, deshalb keine Sequenz möglich!");
        }
        for(i = 0; i < array.length; i++){
            if(zahlen.containsKey(array[i])){
                int rep = zahlen.get(array[i]);
                zahlen.put(array[i], rep+1);
            }
            if(zahlen.containsKey(array[i]) == false){
                zahlen.put(array[i], 1);
            }
        }
         return zahlen;
    }
}
