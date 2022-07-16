package impacta;

public class Controls {

    public static void testar() {
        System.out.println("testando controles...");
        if (1 == 1) {
            System.out.println("obvio, será impresso");
        }
        if (1 == 1) System.out.println("obvio, será impresso");

        int[] numeros = {1,2,3};

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("iteracao %d%n", i);
            System.out.println(numeros[i]);
        }

        for (int i : numeros) {
            System.out.println("iterando com foreach");
            System.out.println(i);
        }

        switch(2) {
            case 1:
                System.out.println("algo com 1");
                break;
            case 2:
                System.out.println("algo com 2");
            default: 
                System.out.println("algo com x");
                break;
        }

        String num = switch(1) {
            case 1, 2 -> "algo com 1 ou dois";
            case 3 -> "algo com 3";
            default -> "x";
        };

        System.out.println(num);
    }

}
