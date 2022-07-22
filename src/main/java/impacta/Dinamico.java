package impacta;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dinamico {

    public static Integer numero() {
        return Integer.valueOf(1);
    }

    public static void testar() {
        System.out.println("Testando Dinamico...");

        var nomeCompleto = "Emilio Murta Resende";
        var idade = 33;
        Integer numero = numero(); // nao faca isso...

        var listaNumeros = new ArrayList<Integer>();
        listaNumeros.size();

        var listaRecursos = new ArrayList<Map<String, String>>();
        listaRecursos.add(new LinkedHashMap<>(){{ put("key", "v"); }});

        var dynamo = new Object() {
            public String nome = "Dynamo";
            public String getNome() {
                return this.nome;
            }
        };

        System.out.println(dynamo.getNome());
    }

}
