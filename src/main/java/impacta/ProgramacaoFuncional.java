package impacta;

import java.util.function.Function;

public class ProgramacaoFuncional {

    public static Function<String, String> funcaoLogger(String prefixo) {
        return (String texto) -> {
            var log = String.format("[%s] %s", prefixo, texto);
            System.out.println(log);

            return log;
        };
    }

    public static String loggerFixo(String texto) {
        System.out.println(texto);
        return texto;
    }


    public static void fazerAlgo(Function<String, String> f, String i) {
        f.apply(i);
    }

    public static void testar() {
        var logger = funcaoLogger("[prefixo]");
        logger.apply("Olá programacao funcional...");
        fazerAlgo(logger, "valor estranho");
        fazerAlgo(ProgramacaoFuncional::loggerFixo, "mais estranho ainda");
    }

}
