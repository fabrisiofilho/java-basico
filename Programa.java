import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    public static void main(String[] args_) {
        String[] args = { "add", "2", "8" };
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            if ("soma".equals(args[0])) {
                somar(args);
            }else if ("add".equals(args[0])) {
                adicionar(args);
            } else if ("mult".equals(args[0])){
                multiplica(args);
            } else if ("exp".equals(args[0])) {
                explica();
            } else {
                listar(args);
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }

    private static void listar(String[] args) {
        for (String item : args) {
            System.out.println(item);
        }
    }

    private static void somar(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) {
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("A soma dos valores: " + soma);
    }

    private static void multiplica(String[] args) {
        Integer multiplica = 1;
        for (int i = 1; i < args.length; i++) {
            multiplica = multiplica * Integer.valueOf(args[i]);
        }
        System.out.println("A multiplicação dos valores " + multiplica);
    }

    private static void adicionar(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 0;
        while (i < args.length) {
            if (!"add".equals(args[i])) {
                compras.add(args[i]);
            }
            ++i;
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }

    private static void explica() {
        Integer i = 0;
        System.out.println("I = 0");
        System.out.println("Após incrementar (i++)");
        System.out.println(i++);
        i = 0;
        System.out.println("Após incrementar (++i)");
        System.out.println(++i);
    }
}