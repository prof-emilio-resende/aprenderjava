package impacta;

record Person(String name) {
    public String upperName() {
        return this.name().toUpperCase();
    }
}

public class Registros {

    public static void testar() {
        System.out.println("Registros...");
        var r = new Person("Emilio");
        System.out.println(r.name());
        System.out.println(r.upperName());
    }

}
