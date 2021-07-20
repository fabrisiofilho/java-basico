import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args_) {
        String[] args = { "soma", "1", "8" };
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            System.out.println(args[0]);
            for (int i = 0; i < args.length; i++) { // i = i + 1 
                Integer a = Integer.valueOf("1");
                System.out.println(args[i]);
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }
}