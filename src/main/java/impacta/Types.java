package impacta;

public class Types {

    public static void testar() {
        System.out.println("Testando tipos ...");
        String nome = "Emilio Murta Resende";
        int idade = 33;
        double peso = 80;

        // boxing vs unboxing
        Integer idadeObjeto = idade; // boxing
        idadeObjeto = 22;
        System.out.println(idadeObjeto.toString());

        // unboxing
        idade = idadeObjeto;
        System.out.println(idade);

        Integer altura = null;

        if (idade % 2 == 0) {
            System.out.println("par valor primitivo");
        }

        if (idadeObjeto % 2 == 0) {
            System.out.println("par valor objeto");
        }

        System.out.printf("Imprimindo %s %.2f %d %d %n", nome, peso, idade, idadeObjeto);
    }

}
