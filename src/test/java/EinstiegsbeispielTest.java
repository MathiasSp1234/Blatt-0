import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    @org.junit.jupiter.api.Test
    void getRepetitions() {
        int[] arrayTest = new int[12];
        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 2;
        arrayTest[3] = 3;
        arrayTest[4] = 3;
        arrayTest[5] = 3;
        arrayTest[6] = 4;
        arrayTest[7] = 4;
        arrayTest[8] = 4;
        arrayTest[9] = 4;
        arrayTest[10] = 5;
        arrayTest[11] = 5;

        Map<Integer,Integer> map = Einstiegsbeispiel.getRepetitions(arrayTest);
        System.out.print(map);


        Map<Integer, Integer> expect = new HashMap<>();

        expect.put(1,1);
        expect.put(2,2);
        expect.put(3,3);
        expect.put(4,4);
        expect.put(5,2);
        Assertions.assertEquals(expect, map);
    }
}