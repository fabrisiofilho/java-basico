import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args_) {
        String[] args = { "add", "2", "8" };
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            if ("soma".equals(args[0])) {
                somar(args);
            } else if ("add".equals(args[0])) {
                adicionar(args);
            } else {
                listar(args);
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }

    private static void listar(String[] args) {
        for (String item : args) {
            if(!"add".equals(args[item])){
                System.out.println(item);
            }
        }
    }

    private static void somar(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) { // i = i + 1 
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("A soma dos valores: " + soma);
    }

    private static void adicionar(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 0;
        while (i < args.length) {
            compras.add(args[i]);
            ++i;
    }
    System.out.println(Arrays.toString(compras.toArray()));
    }
}