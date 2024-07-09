package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsUeben {

    // TODO
    // erzeugen Sie eine Liste mit Zahlen von 1 bis 10
    List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // TODO
    // Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die gerade Zahlen enthält
    // Schreiben Sie hierfür einen Test
    public List<Integer> geradeZahlen(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).toList();
    }

    // TODO
    // Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die Zahlen enthält, die
    // durch 3 teilbar sind
    // Schreiben Sie hierfür einen Test
    public List<Integer> durchDreiTeilbar(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 3 == 0).toList();
    }

}
