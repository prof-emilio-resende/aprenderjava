package impacta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void testar() {
        System.out.println("Testando streams...");
        var listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);

        for(var i : listaNumeros) {
            System.out.println(i);
        }

        List.of(1,2,3)
            .stream()
            .forEach(System.out::println);


        List.of("Emilio", "Murta", "Resende")
            .stream()
            .map((x) -> {
                System.out.println("mapping...");
                return x.toUpperCase();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);

        List.of("Emilio", "Murta", "Resende")
            .stream()
            .map((x) -> {
                System.out.println("mapping...");return x.toUpperCase();
            })
            .forEach(System.out::println);
    }

}
