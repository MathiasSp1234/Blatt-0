//11941774, Mathias Spionjak
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;


class EinstiegsbeispielTest {

    //Testcase mit Sequenz
    @Test
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

        Map<Integer, Integer> expect = new HashMap<>();

        expect.put(1,1);
        expect.put(2,2);
        expect.put(3,3);
        expect.put(4,4);
        expect.put(5,2);
        Assertions.assertEquals(expect, map);
    }
    //Testcase, wenn Zahlen negativ sind
    @Test
    void getRepetitionsTest2() {
        int[] arrayTest = new int[5];
        arrayTest[0] = 1;
        arrayTest[1] = 1;
        arrayTest[2] = 2;
        arrayTest[3] = -2;
        arrayTest[4] = -3;


        Map<Integer,Integer> map = Einstiegsbeispiel.getRepetitions(arrayTest);

        Map<Integer, Integer> expect = new HashMap<>();

        expect.put(-3,1);
        expect.put(-2,1);
        expect.put(1,2);
        expect.put(2,1);
        Assertions.assertEquals(expect, map);
        System.out.println(map);
    }

    //Fehlermeldung, wenn nur ein Element enthalten ist -> keine Sequenz
    @Test
    void getRepetitionsTestArrayLaenge1() {
        int[] arrayTest = new int[1];
        arrayTest[0] = 5;

        Assertions.assertThrows(IllegalArgumentException.class, () -> Einstiegsbeispiel.getRepetitions(arrayTest));
    }
    //Fehlermeldung, wenn Array kein Element enthalten ist
    @Test
    void getRepetitionsTestArrayLeer() {
        int[] arrayTest = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> Einstiegsbeispiel.getRepetitions(arrayTest));
    }
}