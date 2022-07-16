package impacta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Colecoes {

    public static void testar() {
        System.out.println("testando collections...");
        String[] nomes = new String[] {"Emilio", "Murta", "Resende"};
        System.out.println(Arrays.toString(nomes));
        
        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Emilio");
        listaNomes.add("Murta");
        listaNomes.add("Resende");

        System.out.println(listaNomes);

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        List<String> listaNomesInline = new ArrayList<String>() {{
            add("Emilio");
            add("Murta");
            add("Resende");
        }};
        System.out.println(listaNomesInline);

        List<String> listaNomesReduzida = List.of("Emilio", "Murta", "Resende");
        System.out.println(listaNomesReduzida);

        Map<String, String> mapaBasico = new LinkedHashMap<String, String>();
        mapaBasico.put("chave", "valor");
        System.out.println(mapaBasico);

        Map<String, String> mapaBasicoInline = new LinkedHashMap<String, String>() {{
            put("chaveInline", "valorInline");
        }};
        System.out.println(mapaBasicoInline);

        Map<String, String> mapaBasicoReduzido = Map.of("chaveInline1", "valorInline1", "chaveInline2", "valorInline2");
        System.out.println(mapaBasicoReduzido);        
    }

}
