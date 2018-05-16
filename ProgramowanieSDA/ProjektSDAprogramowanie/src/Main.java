import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by wojciechpotocki on 24.04.2018.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        char[] cbuf = new char[1];

        Map<Character, Integer> mapa = new HashMap<>();

        try {
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("output.txt");

            int c;

            while((c = inputStream.read(cbuf, 0, cbuf.length)) != -1) {
                if(mapa.containsKey(cbuf[0])) {
                    mapa.put(cbuf[0], mapa.get(cbuf[0]) + 1);
                } else {
                    mapa.put(cbuf[0],1);
                }


            }
            for(Map.Entry<Character, Integer> entry : mapa.entrySet()) {
                String s = "Klucz: " + entry.getKey() + " Value: " + entry.getValue() + "\n";
                outputStream.write(s);
            }
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }

            if(outputStream != null) {
                outputStream.close();
            }
        }
    }
}
























